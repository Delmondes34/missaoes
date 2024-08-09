<?php 
 include_once 'pasta_para_conectar/Atualizar.php';

 if(isset($_GET['id'])){
    $id = mysqli_escape_string($conectar, $_GET['id']);
    $sql ="SELECT * From historias WHERE id = '$id'";
    $result = mysqli_query($conectar , $sql);
    $dados = mysqli_fetch_array($result);
 }
 
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <link href="conexão.php"/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"/>
    <link href="pasta_para_conectar/conexão.php">
    <link href="pasta_para_conectar/Acao_conect.php">
</head>
<body>
    
    
    <section>
        <h1>Escreva</h1>
    <form action="pasta_para_conectar/Atualizar.php" method="POST" >
        <input type="hidden" name="id" value="<?php echo $dados['id'];?>">
        <div class="col-md-4">
            <div>
                <label for="nome_da_historia" class="form-label">Digite o nome da historia</label>
                <input type="text" require class="form-control" id="nome_da_historia"  aria-describedby="emailHelp" name="nome_da_historia" value="<?php echo $dados['nome_da_historia'];?>" require>
            </div>
            <div>
                <label for="genero">Digite o genero</label>
                <select name="genero"  class="form-select" aria-label="Default select" id="genero" value="<?php echo $dados['genero'];?>" required>
                        <option value=""><?php echo $dados['genero'];?></option>
                        <option value="Ação">Ação</option>
                        <option value="Comedia">Comedia</option>
                        <option value="Romance">Romance</option>
                        <option value="Terro">Terro</option>
                        <option value="Drama">Drama</option>
                        <option value="Ficção">Ficção</option>
                    </select>
            </div>
        </div>
        <div class="mb-3">
            <label for="historia" class="form-label"> Comece a digitar a Sinopse</label>
            <textarea class="form-control" id="historia" rows="4" name="historia" value="<?php echo $dados['historia'];?>"required><?php echo $dados['historia'];?></textarea>
        </div>  
                <Button type="submit" name="atualHist">Atualizar</Button>
                    <a href="index.php">confirmar</a>
            </div>        
        </form> 
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></Script>
</body>
</html>
