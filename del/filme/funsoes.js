
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
    let campoNome = document.getElementById("nome");
    
    if(campoNome.value == ""){
    alert("O campo nome é obrigatório");
    return false;
    }
    if(campoNome.value.length < 3 || campoNome.value.length > 50){
    alert("O campo nome deve ter entre 3 e 50 caracteres");
    }
    
    let campoAnoLancamento = document.getElementById("anoLancamento");
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
    let campoSinopse = document.getElementById("sinopse");
    if(campoSinopse.value == ""){
    alert("O campo sinopse é obrigatório");
    return false;
    }
    
    //campo generero select
    let campoGenero = document.getElementById("genero");
    if(campoGenero.value == ""){
    alert("O campo genero é obrigatório");
    return false;
    }
    
    //validacao duracao obrigatorio
    let campoDuracao = document.getElementById("duracao");
    if(campoDuracao.value == ""){
    alert("O campo duração é obrigatório");
    return false;
    }
    
    //idioma radio
    var idiomaPt = document.getElementById("legendado");
    var idiomaEn = document.getElementById("dublado");
    var idiomaEn = document.getElementById("original");
    if(!idiomaPt.checked && !idiomaEn.checked){
    alert("Selecione um idioma");
    return false;
    }
    
    return true;
    }
  
bancoDeDados = [];

  //tabela
  let formulario = document.querySelector('form');
  formulario.addEventListener('submit', function(event){
  //recuperando os campos do formulário
  let campos = [
  document.querySelector('#identificador'),
  document.querySelector('#nome'),
  document.querySelector('#anoDeLançamento'),
  document.querySelector('#sinopse'),
  document.querySelector('#genero'),
  document.querySelector('#duracao'),
  document.querySelector('#ep'),
  document.querySelector('input[name="tipoAudio"]:checked')
  ]
  event.preventDefault();
 
  let linha = document.createElement('tr');
  for(let i=0; i < campos.length; i++){
  let coluna = document.createElement('td');
  coluna.textContent = campos[i].value;
  linha.appendChild(coluna);
  }

  let tbody = document.querySelector('#corpoDaTable');

  //criando objeto com os dados do formulário
  let registro = {
    identificador: campos[0].value,
    nome: campos[1].value,
    anoDeLançamento: campos[2].value,
    sinopse: campos[3].value,
    genero: campos[4].value,
    duracao: campos[5].value,
    ep: campos[6].value,


  }

  bancoDeDados.push(registro);
  //adicionando coluna acoes na tabela Alterar e Excluir
  let coluna = document.createElement('td');
  let link = document.createElement('a');
  link.href = '#';
  link.textContent = 'Alterar';
  link.onclick = function(){
    carregaFormulario(registro.identificador);
  }

  coluna.appendChild(link);
  linha.appendChild(coluna);

  //adicionando a linha na tabela
  tbody.appendChild(linha);
  
  
document.querySelector('#formulario').reset()
  })

  function carregaFormulario(identificador){
    //recuperar o registro do banco de dados
    let registro = bancoDeDados.find(function(item){
        return item.identificador == identificador;
    })

    document.querySelector('#identificador').value = registro.identificador;
    document.querySelector('#nome').value = registro.nome;
    document.querySelector('#anoDeLançamento').value = registro.anoDeLançamento;
    document.querySelector('#sinopse').value = registro.sinopse;
    document.querySelector('#genero').value = registro.genero;
    document.querySelector('#duracao').value = registro.duracao;
    document.querySelector('#ep').value = registro.ep;
    document.querySelector('#input[name="tipoAudio"]:checked').value = registro.tipoAudio;
}







