<?php
session_start();
if($_POST["nombre"] != "" && $_POST["clave"]!= ""){
    $_SESSION["nombre"] = $_POST["nombre"];
    $_SESSION["clave"] = $_POST["clave"];
}else{
    header("Location: index.php");
}


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>Panel Principal</h1>
    <h2>Bienvenido: <?php echo $_SESSION["nombre"]?></h2>
    <hr>
    <a href="otrapagina.php">Ir a otra pagina dentro del sitio</a>
    <br>
    <a href="cerrarsesion.php">Cerrar sesion</a>
</body>
</html>