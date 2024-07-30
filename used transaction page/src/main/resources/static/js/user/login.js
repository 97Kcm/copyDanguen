/******************** modal창 on/off ********************************/

const loginBtn = document.getElementById('main-login-btn');
const modalSection = document.querySelector('#dangeun-login-modal');
const cancelBtn = document.querySelector('#cancel-btn');

loginBtn.onclick = () => {
    modalSection.toggleAttribute('active', true);
}
cancelBtn.onclick = () => {
    modalSection.toggleAttribute('active', false);
}

const showBtn = document.querySelector('.show-btn');
const passwordInput = document.querySelector('#password-input');

showBtn.onclick = () => {
    if(passwordInput.type === 'password'){
        passwordInput.type = 'text';
    }else if(passwordInput.type === 'text'){
        passwordInput.type = 'password';
    }
}