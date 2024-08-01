const logoutBtn = document.getElementById('logout-btn');
if(logoutBtn !== null) {
    logoutBtn.onclick = (e) => {
        e.preventDefault();
        const form = document.forms.item(0);
        form.action = "/user/logout";
        form.method = 'POST';
        form.submit();
    };
}

/****************** 검색 기능 ************************/
const headerSearchInput = document.getElementById('header-search-input');
const headerSearchBtn = document.getElementById('header-search-btn');


headerSearchBtn.onclick = () => {
    const searchTitle = headerSearchInput.value;
    location.href = `/main?searchTitle=${searchTitle}&searchAddress=${searchTitle}`;
}

