package com.mycompany.practica1_miguelhuayhua;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InscripcionCurso", urlPatterns = {"/InscripcionCurso"})
public class InscripcionCurso extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean datos = false;
        String nombre = null;
        String apellido = null;
        String curso = null;
        Cookie[] cookies = request.getCookies();
        if (cookies.length > 0) {
            for (Cookie c : cookies) {
                if ("nombre".equals(c.getName())) {
                    apellido = c.getValue();
                } else if ("apellido".equals(c.getName())) {
                    nombre = c.getValue();
                } else if ("curso".equals(c.getName())) {
                    curso = c.getValue();
                }
            }
            datos = true;
            com.practica1_miguelhuayhua.entidades.InscripcionCurso i_curso = new com.practica1_miguelhuayhua.entidades.InscripcionCurso(nombre, apellido, curso);
            request.setAttribute("i_curso", i_curso);

        }
        request.setAttribute("datos", datos);
        request.getRequestDispatcher("FormularioCurso/formcurso.jsp").forward(request, response);

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
        String curso = request.getParameter("curso");
        Cookie c1, c2, c3 = null;
        c1 = new Cookie("nombre", request.getParameter("nombre"));
        c2 = new Cookie("apellido", request.getParameter("apellido"));
        c3 = new Cookie("curso", request.getParameter("curso"));
        c1.setMaxAge(3600);
        c2.setMaxAge(3600);
        c2.setMaxAge(3600);
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
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
