<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<h1>FORMULARIO CON GET</h1>
<form method="GET" action="pagina2_resp_get.php">
        Nombre<br>
        <input type="text" id="txtNombre" name="nombreusuario"/>
        <br>
        Contraseña:<br>
        <input type="password" id="txtClave" name="clave"/>
        <br>
        Numero Tarjeta:<br>
        <input type="text" id="txtNumTarjeta" name="numtarjeta"/><br>
        Codigo CVC:<br>
        <input type="text" id="txtCvc" name="cvc"/><br>
        <br>
        <input type="submit" value="Ingresar"/>
    </form>

    <h1>FORMULARIO CON POST</h1>
    <form method="POST" action="pagina2_resp_post.php">
        Nombre<br>
        <input type="text" id="txtNombre" name="nombreusuario"/>
        <br>
        Contraseña:<br>
        <input type="password" id="txtClave" name="clave"/>
        <br>
        Numero Tarjeta:<br>
        <input type="text" id="txtNumTarjeta" name="numtarjeta"/><br>
        Codigo CVC:<br>
        <input type="text" id="txtCvc" name="cvc"/><br>
        <br>
        <input type="submit" value="Ingresar"/>
    </form>

</body>
</html>