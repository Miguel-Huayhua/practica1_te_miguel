package com.mycompany.practica1_miguelhuayhua;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroUsuario", urlPatterns = {"/RegistroUsuario"})
public class RegistroUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean datos = false;
        String nombre = null;
        String apellido = null;
        String correo = null;
        String pass = null;
        Cookie[] cookies = request.getCookies();
        if (cookies.length > 0) {
            for (Cookie c : cookies) {
                if ("nombre1".equals(c.getName())) {
                    apellido = c.getValue();
                } else if ("apellido1".equals(c.getName())) {
                    nombre = c.getValue();
                } else if ("correo".equals(c.getName())) {
                    correo = c.getValue();
                } else if ("pass".equals(c.getName())) {
                    pass = c.getValue();
                }
            }
            datos = true;
            com.practica1_miguelhuayhua.entidades.Usuario i_curso = new com.practica1_miguelhuayhua.entidades.Usuario(nombre, apellido, correo, pass);
            request.setAttribute("r_usuario", i_curso);

        }
        request.setAttribute("datos", datos);
        request.getRequestDispatcher("FormularioUsuario/formusuario.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String curso = request.getParameter("pass");
        Cookie c1, c2, c3, c4 = null;
        c1 = new Cookie("nombre1", request.getParameter("nombre"));
        c2 = new Cookie("apellido1", request.getParameter("apellido"));
        c3 = new Cookie("correo", request.getParameter("correo"));
        c4 = new Cookie("pass", request.getParameter("pass"));
        c1.setMaxAge(3600);
        c3.setMaxAge(3600);
        c4.setMaxAge(3600);
        c3.setMaxAge(3600);
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        response.addCookie(c4);
        com.practica1_miguelhuayhua.entidades.InscripcionCurso i_curso = new com.practica1_miguelhuayhua.entidades.InscripcionCurso(nombre, apellido, curso);
        request.setAttribute("i_curso", i_curso);

        request.setAttribute("datos", true);
        request.getRequestDispatcher("/").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
