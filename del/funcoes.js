

//tabela
var formulario = document.querySelector('form');
formulario.addEventListener('submit', function(event){
//recuperando os campos do formulário
var campos = [
document.querySelector('#nome'),
document.querySelector('#ano de lançamnto'),
document.querySelector('#sinops'),
document.querySelector('#genero'),
document.querySelector('#durtaçao'),
document.querySelector('#quantidade de ep'),
document.querySelector('#idioma')
]
event.preventDefault();

//verificando se os campos estão preenchidos
for(var i= 0; i < campos.length; i++){
if(campos[i].value == ''){
alert('Preencha todos os campos');
return;
}
}

//criando a linha da tabela
var linha = document.createElement('tr');
for(var i=0; i < campos.length; i++){
var coluna = document.createElement('td');
coluna.textContent = campos[i].value;
linha.appendChild(coluna);
}
//adicionando a linha na tabela
var tbody = document.querySelector('#corpoDaTable');
//adicionando a linha na tabela
tbody.appendChild(linha);

for(var i=0; i < campos.length; i++){
coluna.textContent = campos[i].value = '';
}

})
//fim da tabela

// Example starter JavaScript for disabling form submissions if there are invalid fields
(() => {
    'use strict'
  
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    const forms = document.querySelectorAll('.needs-validation')
  
    // Loop over them and prevent submission
    Array.from(forms).forEach(form => {
      form.addEventListener('submit', event => {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }
  
        form.classList.add('was-validated')
      }, false)
    })
  })()



