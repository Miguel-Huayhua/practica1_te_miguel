package com.mycompany.practica1_miguelhuayhua;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroLibro", urlPatterns = {"/RegistroLibro"})
public class RegistroLibro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean datos = false;
        String titulo = null;
        String autor = null;
        String resumen = null;
        String medio = null;

        Cookie[] cookies = request.getCookies();
        if (cookies.length > 0) {
            for (Cookie c : cookies) {
                if ("titulo".equals(c.getName())) {
                    titulo = c.getValue();
                } else if ("autor".equals(c.getName())) {
                    autor = c.getValue();
                } else if ("resumen".equals(c.getName())) {
                    resumen = c.getValue();
                } else if ("medio".equals(c.getName())) {
                    medio = c.getValue();
                }
            }
            datos = true;
            com.practica1_miguelhuayhua.entidades.Libro i_curso = new com.practica1_miguelhuayhua.entidades.Libro(titulo, autor, resumen, medio);
            request.setAttribute("i_curso", i_curso);

        }
        request.setAttribute("datos", datos);
        request.getRequestDispatcher("FormularioLibro/formlibro.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String medio = request.getParameter("medio");

        Cookie c1, c2, c3, c4 = null;
        c1 = new Cookie("titulo", request.getParameter("titulo"));
        c2 = new Cookie("autor", request.getParameter("autor"));
        c3 = new Cookie("resumen", request.getParameter("resumen"));
        c4 = new Cookie("medio", request.getParameter("medio"));
        c1.setMaxAge(3600);
        c2.setMaxAge(3600);
        c2.setMaxAge(3600);
        c4.setMaxAge(3600);
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        response.addCookie(c4);
        com.practica1_miguelhuayhua.entidades.Libro i_curso = new com.practica1_miguelhuayhua.entidades.Libro(titulo, autor, resumen, medio);

        request.setAttribute("i_curso", i_curso);

        request.setAttribute("datos", true);
        request.getRequestDispatcher("/").forward(request, response);
    }

}
