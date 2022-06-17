<?php
session_start();

if(!isset($_SESSION["nombre"]) && !isset($_SESSION["clave"])){
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
    <h1>Otra Pagina</h1>
    <h2>Bienvenido: <?php echo $_SESSION["nombre"]?></h2>
    <hr>
    <a href="mipanel.php">Ir a Mi Panel</a>
    <br>
    <a href="cerrarsesion.php">Cerrar sesion</a>
</body>
</html>