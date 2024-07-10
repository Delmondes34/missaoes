

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




  function validaFormulario(evento){
    if(!validCampos()){
    evento.preventDefault();
    }
    }
    
    function validCampos(){
    var campoNome = document.getElementById("nome");
    
    if(campoNome.value == ""){
    alert("O campo nome é obrigatório");
    return false;
    }
    if(campoNome.value.length < 3 || campoNome.value.length > 50){
    alert("O campo nome deve ter entre 3 e 50 caracteres");
    }
    
    var campoAnoLancamento = document.getElementById("anoLancamento");
    if(campoAnoLancamento.value == ""){
    alert("O campo ano de lançamento é obrigatório");
    return false;
    }
    if(campoAnoLancamento.value.length != 4){
    alert("O campo ano de lançamento deve ter 4 digitos");
    return false;
    }
    if(isNaN(campoAnoLancamento.value)){
    alert("O campo ano de lançamento deve ser um número");
    return false;
    }
    if(parseInt(campoAnoLancamento.value) > 2024){
    alert("O campo ano de lançamento deve ser menor que 2024");
    return false;
    }
    
    //Validar campo de sipnopse textArea
    var campoSinopse = document.getElementById("sinopse");
    if(campoSinopse.value == ""){
    alert("O campo sinopse é obrigatório");
    return false;
    }
    
    //campo generero select
    var campoGenero = document.getElementById("genero");
    if(campoGenero.value == ""){
    alert("O campo genero é obrigatório");
    return false;
    }
    
    //validacao duracao obrigatorio
    var campoDuracao = document.getElementById("duracao");
    if(campoDuracao.value == ""){
    alert("O campo duração é obrigatório");
    return false;
    }
    
    //idioma radio
    var idiomaPt = document.getElementById("legendado");
    var idiomaEn = document.getElementById("dublado");
    var idiomaOr = document.getElementById("original")
    if(!idiomaPt.checked && !idiomaEn.checked){
    alert("Selecione um idioma");
    return false;
    }
    
    return true;
    }
