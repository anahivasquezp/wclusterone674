<?php
echo count($_COOKIE);
print_r($_COOKIE);

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
    <h2>Bienvenido: <?php echo $_COOKIE["c_nombre"]?></h2>
    <hr>
    <a href="borrarcookies.php?borrar=0">Regresar</a>
    <br>
    <a href="borrarcookies.php?borrar=1">Borrar Cookies y Regresar</a>
</body>
</html>