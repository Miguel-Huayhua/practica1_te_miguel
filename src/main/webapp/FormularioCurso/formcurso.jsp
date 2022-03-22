
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica 1 Miguel Huayhua Condori</title>

    </head>
    <body>
        <jsp:useBean id="i_curso" scope="request" class="com.practica1_miguelhuayhua.entidades.InscripcionCurso" />

        <%
            if (Boolean.parseBoolean(request.getAttribute("datos").toString())) {
        %>
        <h3>Nombre:  <jsp:getProperty name="i_curso" property="nombre" /></h3>
        <h3>Apellidos:  <jsp:getProperty name="i_curso" property="apellido" /></h3>
        <h3>Curso:  <jsp:getProperty name="i_curso" property="curso" /></h3>
        <%
        } else {
        %>
        Sin datos de formulario aún...
        <%}%>   

        <button>
            <a href="FormularioCurso/FormularioCurso.jsp">Ir a formulario</a>
        </button>
    </body>
</html>
