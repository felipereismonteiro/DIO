const botao = document.getElementById('botao')
const text = document.getElementById('texto')
const footer = document.getElementsByTagName('footer')[0]
const body = document.getElementsByTagName('body')[0]

function change(){
    changeBack();
    changeText();
}
function changeText(){
    if(body.classList.contains('darkmode')){
        texto.innerHTML = 'DARKMODE ON'
    }else{
        texto.innerHTML = 'DARKMODE OFF'
    }
}
function changeBack(){
    document.body.classList.toggle('darkmode')
    footer.classList.toggle('lightmode')
}

botao.addEventListener('click',change)