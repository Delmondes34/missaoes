<?php
//coneção 
require_once 'db_connect.php';
if(isset($_POST['btn-cadastrar'])):
    $nome = mysqli_escape_string($connect, $_POST['nome']);
    $sobrenome = mysqli_escape_string($connect, $_POST['sobrenome']);
    $email = mysqli_escape_string($connect, $_POST['email']);
    $idade = mysqli_escape_string($connect, $_POST['idade']);
    
    $sql = "INSERT INTO clientes (nome, sobrenome, email, idade) VALUE ('$nome', '$sobrenome', '$email', '$idade')";
    if(mysqli_query($connect, $sql))
        header('location: index.php?sucesso');
    else
        header('location: index.php?erro');
    
endif;
?>