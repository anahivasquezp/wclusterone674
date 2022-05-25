<?php
echo var_dump ($_POST);
/*
if(isset($_POST["nombre"])){
    $nombre = $_POST["nombre"];
}else{
    $nombre = "";
}
*/
$nombre = isset($_POST["nombre"])?$_POST["nombre"]:"";
$clave= isset($_POST["clave"])?$_POST["clave"]:"";
$sexo=isset($_POST["hm"])?$_POST["hm"]:"";
$guardarPreferencias = isset($_POST["chkpreferencias"])?$_POST["chkpreferencias"]:"";

if($guardarPreferencias != ""){
    setcookie("c_nombre",$nombre);
    setcookie("c_clave",$clave);
    setcookie("c_sexo",$sexo);
    setcookie("c_preferencias",$guardarPreferencias);
}

header("Location: mipanel.php");
?>