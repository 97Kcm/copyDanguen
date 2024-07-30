const fullEmail = document.getElementById('full-email');
const emailHead = document.getElementById('email-head');
const emailTail = document.getElementById('email-tail');
const selectEmail = document.getElementById('select-email');
const addressSelect = document.getElementById('address-select');
const addressInput = document.getElementById('address-input');
const token = document.getElementById('token');

const registerBtn = document.getElementById('register-btn');
/******** 회원가입 버튼 클릭 *********/
registerBtn.onclick = () => {
    fullEmail.value = emailHead.value + "@" + emailTail.value;
    if(selectEmail.value !== "직접입력"){
        emailTail.value = selectEmail.value;
    }
    addressInput.value = addressSelect.value;

    if(emailCertBtn.disabled === true && certCheckBtn.disabled === true){
        registerBtn.type = 'submit';
    }else{
        registerBtn.type = 'button';
        alert('이메일 인증이 필요합니다.');
    }

}
/********* 이메일 선택창 클릭 시 *********/
selectEmail.onchange = () => {
    if(selectEmail.value !== "직접입력"){
        emailTail.value = selectEmail.value;
    }else{
        emailTail.value = "";
    }
}

/********* 이메일 미 입력 시 *************/
const validationEmail = document.querySelector('.validation-check.email');

emailHead.addEventListener('focusout', () => {
    if(emailHead.value.trim() === "" && emailTail.value.trim() === ""){
        validationEmail.toggleAttribute('active', true);
    }else{
        validationEmail.toggleAttribute('active', false);
    }
})

emailTail.addEventListener('focusout', () => {
    if(emailHead.value.trim() === "" && emailTail.value.trim() === ""){
        validationEmail.toggleAttribute('active', true);
    }else{
        validationEmail.toggleAttribute('active', false);
    }
})

/********** 비밀번호 중복 시 *****************/
const pw1ValidCheck = document.querySelector('.validation-check.pw1');
const pw2ValidCheck = document.querySelector('.validation-check.pw2');
const pwInput = document.querySelectorAll('.pw-input');
const regPattern = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*])[a-zA-Z\d!@#$%^&*]+$/;

pwInput.item(0).addEventListener('focusout', () => {
    const firstPwInputValue = pwInput.item(0).value;
    const result = regPattern.test(firstPwInputValue);

    if(result){
        pw1ValidCheck.toggleAttribute('active', true);
        pw1ValidCheck.textContent = "올바른 비밀번호 양식입니다."
    }else{
        pw1ValidCheck.toggleAttribute('active', true);
        pw1ValidCheck.textContent = "올바르지 않은 비밀번호 양식입니다."
    }
})



pwInput.item(1).addEventListener('focusout', () => {
    if(pwInput.item(0).value !== "" && pwInput.item(1).value === pwInput.item(0).value){
        pw2ValidCheck.toggleAttribute('active', false);
    }else{
        pw2ValidCheck.toggleAttribute('active', true);
        pw2ValidCheck.textContent = "비밀번호가 일치하지 않습니다.";
    }
})

/****************** 이름 미입력 시 ********************/
const nameInput = document.getElementById('name-input');
const validationName = document.querySelector('.validation-check.name');

nameInput.addEventListener('focusout', () => {
    if(nameInput.value.trim() === ""){
        validationName.toggleAttribute('active', true);
    }
})

/*************** 닉네임 미입력 시 **************************/
const nicknameInput = document.getElementById('nickname-input');
const validationNickname = document.querySelector('.validation-check.nickname');

nicknameInput.addEventListener('focusout', () => {
    if(nicknameInput.value.trim() === ""){
        validationNickname.toggleAttribute('active', true);
    }
})

/************* 주소 선택 미선택 시 ***************************/
const validationAddress = document.querySelector('.validation-check.address');

addressSelect.onblur = () => {
    if(addressSelect.value === "지역을 선택하세요"){
        validationAddress.toggleAttribute('active', true);
    }else{
        validationAddress.toggleAttribute('active', false);
    }
};

addressSelect.onchange = () => {
    if(addressSelect.value === "지역을 선택하세요"){
        validationAddress.toggleAttribute('active', true);
    }else{
        validationAddress.toggleAttribute('active', false);
    }
}

/*********************** 메일 인증 버튼 클릭 시 *********************/
const emailCertBtn = document.querySelector('#certification-btn-section > button');

emailCertBtn.onclick = () => {
    fullEmail.value = emailHead.value + "@" + emailTail.value;
    if(selectEmail.value !== "직접입력"){
        emailTail.value = selectEmail.value;
    }
    fetch(`/mail/send-cert?email=${fullEmail.value}`,{
        method: "POST",
        headers : {"X-CSRF-TOKEN" : token.value}
    })
    alert("메일이 전송되었습니다.")
}

/************ 인증번호 작성 후 버튼 클릭 시 **************************/
const certCheckBtn = document.querySelector('#cert-check-btn');
const checkUUID = document.querySelector('#uuid');
const validationCheckCert = document.querySelector('.validation-check.cert');

certCheckBtn.onclick = () => {
    fetch(`/mail/success-cert?uuid=${checkUUID.value}`,{
        method: "POST",
        headers : {"X-CSRF-TOKEN" : token.value}
    }).then(response => response.json())
        .then(value => {
            if(value){
                certCheckBtn.textContent = "인증 완료";
                certCheckBtn.disabled = true;
                emailCertBtn.disabled = true;
                validationCheckCert.toggleAttribute('active', true);
                validationCheckCert.textContent = "인증이 완료되었습니다."
            }else{
                validationCheckCert.toggleAttribute('active', true);
            }
        })
}

/********** 비밀번호 공개/비공개 클릭 시 *******************/
const passwordViewOnOffBtn = document.getElementsByClassName('fa-eye');
const passwordInput = document.querySelectorAll('input[type=password]');

for (let i = 0; i < passwordViewOnOffBtn.length; i++) {
    passwordViewOnOffBtn[i].onclick = () => {
        if(passwordInput[i].type === 'password'){
            passwordInput[i].type = 'text';
        }else if(passwordInput[i].type === 'text'){
            passwordInput[i].type = 'password';
        }
    }
}

/************ 취소 버튼 클릭 시 **********************/
const cancelBtn = document.getElementById('cancel-btn');
cancelBtn.onclick = () => {
    location.href = "/user/login";
}