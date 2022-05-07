const BASE_URL = "https://thatcopy.pw/catapi/rest/"
const cat = document.getElementById('cat')
const change = document.getElementById('change-cat')

const getCat = async () =>{
    const data = await fetch(BASE_URL)
    .then((res) => res.json())
    .catch((e) => console.log(e))

    return data.webpurl
}


const loading = async () =>{
    cat.src = await getCat();
}
change.addEventListener('click',loading)

loading();


