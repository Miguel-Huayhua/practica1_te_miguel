<%-- 
    Document   : FormularioProducto
    Created on : 22-03-2022, 04:40:53 PM
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
        <h1>Registro Producto</h1>
        <form action="/practica1_miguelhuayhua/RegistroProducto" method="POST">
            <label for="producto">Producto</label>
            <input id="producto" name="producto" placeholder="Introduzca el producto...">
            <br>
            <label for=categoria">Categoria</label>
            <select id="categoria" name="categoria">
                <option value="categoria1">Categoria 1</option>
                <option value="categoria2">Categoria 2</option>
                <option value="categoria3">Categoria 3</option>
                <option value="categoria4">Categoria 4</option>
                
            </select>
            <br>
            <label for=existencia">Existencia: </label>
            <input id="existencia" type="number" name="existencia" placeholder="Introduzca la existencia">
            <br>
            <label for=precio">Precio: </label>
            <input id="precio" type="decimal" name="precio" placeholder="Introduzca el precio">
            <br>
          
            <input type="submit" value = "Enviar Datos">
        </form>
    </body>
</html>
