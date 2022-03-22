<%-- 
    Document   : FormularioCurso
    Created on : 22-03-2022, 02:06:56 PM
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
        <h1>Inscripción en curso</h1>
        <form action="/practica1_miguelhuayhua/InscripcionCurso" method="POST">
            <label for="nombre">Nombre</label>
            <input id="nombre" name="nombre" placeholder="Introduzca su nombre...">
            <br>
            <label for=apellido">Apellidos</label>
            <input id="apellido" name="apellido" placeholder="Introduzca su apellido">
            <br>
            <label for=curso">Curso</label>
            <select id="curso" name="curso">
                <option value="curso1">Curso 1</option>
                <option value="curso2">Curso 2</option>
                <option value="curso3">Curso 3</option>
                <option value="curso4">Curso 4</option>
            </select>
            <br>
            <input type="submit" value = "Enviar Datos">
        </form>
    </body>
</html>
