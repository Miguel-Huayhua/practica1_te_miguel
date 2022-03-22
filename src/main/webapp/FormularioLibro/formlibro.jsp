<%-- 
    Document   : formlibro
    Created on : 22-03-2022, 05:02:51 PM
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
        <jsp:useBean id="i_curso" scope="request" class="com.practica1_miguelhuayhua.entidades.Libro" />

        <%
            if (Boolean.parseBoolean(request.getAttribute("datos").toString())) {
        %>
        <h3>Título:  <jsp:getProperty name="i_curso" property="titulo" /></h3>
        <h3>Autor:  <jsp:getProperty name="i_curso" property="autor" /></h3>
        <h3>Resumen:  <jsp:getProperty name="i_curso" property="resumen" /></h3>
        <h3>Medio:  <jsp:getProperty name="i_curso" property="medio" /></h3>

        <%
        } else {
        %>
        Sin datos de formulario aún...
        <%}%>   

        <button>
            <a href="FormularioLibro/FormularioLibro.jsp">Ir a formulario</a>
        </button>
    </body>
</html>
