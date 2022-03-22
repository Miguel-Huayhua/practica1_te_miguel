<%-- 
    Document   : formusuario
    Created on : 22-03-2022, 03:41:54 PM
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <jsp:useBean id="r_usuario" scope="request" class="com.practica1_miguelhuayhua.entidades.Usuario" />

        <%
            if (Boolean.parseBoolean(request.getAttribute("datos").toString())) {
        %>
        <h3>Nombre:  <jsp:getProperty name="r_usuario" property="nombre" /></h3>
        <h3>Apellidos:  <jsp:getProperty name="r_usuario" property="apellido" /></h3>
        <h3>Curso:  <jsp:getProperty name="r_usuario" property="correo" /></h3>
        <h3>Contraseña:  <jsp:getProperty name="r_usuario" property="pass" /></h3>

        <%
        } else {
        %>
        Sin datos de formulario aún...
        <%}%>   

        <button>
            <a href="FormularioUsuario/FormularioUsuario.jsp">Ir a formulario</a>
        </button>
    </body>
</html>
