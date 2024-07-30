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