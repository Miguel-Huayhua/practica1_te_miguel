<%-- 
    Document   : formproducto
    Created on : 22-03-2022, 04:41:05 PM
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
        <jsp:useBean id="i_curso" scope="request" class="com.practica1_miguelhuayhua.entidades.Producto" />

        <%
            if (Boolean.parseBoolean(request.getAttribute("datos").toString())) {
        %>
        <h3>Prodcuto:  <jsp:getProperty name="i_curso" property="producto" /></h3>
        <h3>Categoria:  <jsp:getProperty name="i_curso" property="categoria" /></h3>
        <h3>Existencia:  <jsp:getProperty name="i_curso" property="existencia" /></h3>
        <h3>Precio:  <jsp:getProperty name="i_curso" property="precio" /> Bs.</h3>

        <%
        } else {
        %>
        Sin datos de formulario aún...
        <%}%>   

        <button>
            <a href="FormularioProducto/FormularioProducto.jsp">Ir a formulario</a>
        </button>
    </body>
</html>
