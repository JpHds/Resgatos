// Função para exibir o menu mobile

function menuShow() {
    let menuMobile = document.querySelector('.mobile-menu');
    if (menuMobile.classList.contains('open')) {
        menuMobile.classList.remove('open');
        document.querySelector('.icon').src = "/img/menu_white_36dp.svg";
    } else {
        menuMobile.classList.add('open');
        document.querySelector('.icon').src = "/img/close_white_36dp.svg";
    }
}

// Função para redirecionar usuário para o whatsapp com mensagem automática

function sendMessage() {
    window.open('https://api.whatsapp.com/send/?phone=%2B5579988222654&text=Olá,%20quero%20me%20voluntariar!%20:D&type=phone_number&app_absent=0');
}

document.addEventListener("DOMContentLoaded", function() {
    var botao = document.getElementById("redirectToWhatsapp");
    botao.addEventListener("click", sendMessage);
});