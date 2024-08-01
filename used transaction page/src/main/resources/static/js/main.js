const selectAddress = document.getElementById('select-address');
const selectCategory = document.getElementById('select-category');
const searchBtn = document.getElementById('search-btn');

searchBtn.onclick = () => {
    console.log('버튼클릭')
    const searchTitle = headerSearchInput.value;
    const searchAddress = selectAddress.value;
    const searchCategory = selectCategory.value;
    location.href = `/main?searchTitle=${searchTitle}&searchAddress=${searchAddress}&searchCategory=${searchCategory}`;
}
