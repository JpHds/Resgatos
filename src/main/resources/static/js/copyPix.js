document.getElementById('forCopy').addEventListener('click', function() {
    // Selecionar o texto dentro do span
    var textForCopy = document.getElementById('forCopy');
    var select = window.getSelection();
    var newSelect = document.createRange();
    newSelect.selectNodeContents(textForCopy);
    select.removeAllRanges();
    select.addRange(newSelect);

    document.execCommand('copy');

    select.removeAllRanges();

    alert('Código copiado \n' + textForCopy.innerText);
  });