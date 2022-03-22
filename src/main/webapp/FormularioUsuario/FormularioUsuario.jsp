<%-- 
    Document   : FormularioCurso
    Created on : 22-03-2022, 03:41:24 PM
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica 1 Miguel Huayhua Condori</title>
    </head>
    <body>
        <h1>Registro Usuario</h1>
        <form action="/practica1_miguelhuayhua/RegistroUsuario" method="POST">
            <label for="nombre">Nombre</label>
            <input id="nombre" name="nombre" placeholder="Introduzca su nombre...">
            <br>
            <label for=apellido">Apellidos</label>
            <input id="apellido" name="apellido" placeholder="Introduzca su apellido">
            <br>
            <label for=correo">Correo Electrónico: </label>
            <input id="correo" name="correo" placeholder="Introduzca su correo">
            <br>
            <label for=contra">Contraseña: </label>
            <input id="contra" type="password" name="pass" placeholder="Introduzca su contraseña...>">
            <br>
          
            <input type="submit" value = "Enviar Datos">
        </form>
    </body>
</html>
