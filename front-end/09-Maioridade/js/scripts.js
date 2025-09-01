// variavel do fornulário
const form = document.querySelector('form');
// arrow function
const msg = (texto) => {
    // variavel locais
    let nome = document.getElementById('nome').value;
    let idade = document.getElementById('idade').value;
    const result = (idade >= 18) ? 'é maior de idade. ':'é menor de idade.';

    document.querySelector('#result').innerHTML = `${nome} ${result}`;
    
    
}

// evento
form.addEventListener('submit', function (event) {
    
    // desativa o submit
   event.preventDefault();

    // execulta a função
    msg();
});
   


