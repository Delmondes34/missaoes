<?php

require_once 'conexao.php';

if(isset($_POST['atualHist'])){

    $nomDaHis = mysqli_escape_string($conectar, $_POST['nome_da_historia']);
    $genero = mysqli_escape_string($conectar, $_POST['genero']);
    $historia = mysqli_escape_string($conectar, $_POST['historia']);

    $id = mysqli_escape_string($conectar, $_POST['id']);

    $sql = "DELETE historias SET nome_da_historia = '$nomDaHis', genero = '$genero', historia = '$historia' WHERE id = '$id' ";

    if(mysqli_query($conectar , $sql)){
        echo "sucesso";
        header('Location: ../pasta_para_conectar/index.php?sucesso');
    }else{
        header('Location: index.php?erro');
    }
}
?>