<%-- 
    Document   : FormularioLibro
    Created on : 22-03-2022, 05:02:38 PM
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
        <h1>Registro Libro</h1>
        <form action="/practica1_miguelhuayhua/RegistroLibro" method="POST">
            <label for="titulo">Titulo: </label>
            <input id="titulo" name="titulo" placeholder="Introduzca el titulo...">
            <br>
            <label for="autor">Autor: </label>
            <input id="autor" name="autor" placeholder="Introduzca el autor...">

            <br>
            <label for="resumen">Resumen: </label>
            <input id="resumen"  name="resumen" placeholder="Introduzca el resumen...">
            <br>
            <label for="medio">Medio: </label>
            <label for="medio">Físico </label>
            <input id="fisico" type="radio" name="medio" value="fisico" >
            <label for="medio">Magnetico </label>
            <input id="magnetico" type="radio" name="medio" value="magnetico" >
            <br>

            <input type="submit" value = "Enviar Datos">
        </form>
    </body>
</html>
