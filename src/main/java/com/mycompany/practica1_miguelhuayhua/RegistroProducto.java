package com.mycompany.practica1_miguelhuayhua;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegistroProducto", urlPatterns = {"/RegistroProducto"})
public class RegistroProducto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean datos = false;
        String producto = null;
        String categoria = null;
        int existencia = 0;
        float precio = 0;
        Cookie[] cookies = request.getCookies();
        if (cookies.length > 0) {
            for (Cookie c : cookies) {
                if ("producto".equals(c.getName())) {
                    producto = c.getValue();
                } else if ("categoria".equals(c.getName())) {
                    categoria = c.getValue();
                } else if ("existencia".equals(c.getName())) {
                    existencia = Integer.parseInt(c.getValue());
                } else if ("precio".equals(c.getName())) {
                    precio = Float.parseFloat(c.getValue());
                }
            }
            datos = true;
            com.practica1_miguelhuayhua.entidades.Producto i_curso = new com.practica1_miguelhuayhua.entidades.Producto(producto, categoria, existencia, precio);
            request.setAttribute("i_curso", i_curso);

        }
        request.setAttribute("datos", datos);
        request.getRequestDispatcher("FormularioProducto/formproducto.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("producto");
        String categoria = request.getParameter("categoria");
        int existencia = Integer.parseInt(request.getParameter("existencia"));
        float precio = Float.parseFloat(request.getParameter("precio"));
        Cookie c1, c2, c3, c4 = null;
        c1 = new Cookie("producto", request.getParameter("producto"));
        c2 = new Cookie("categoria", request.getParameter("categoria"));
        c3 = new Cookie("existencia", request.getParameter("existencia"));
        c4 = new Cookie("precio", request.getParameter("precio"));
        c1.setMaxAge(3600);
        c2.setMaxAge(3600);
        c2.setMaxAge(3600);
        c4.setMaxAge(3600);
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        response.addCookie(c4);
        com.practica1_miguelhuayhua.entidades.Producto i_curso = new com.practica1_miguelhuayhua.entidades.Producto(producto, categoria, existencia, precio);
        request.setAttribute("i_curso", i_curso);

        request.setAttribute("datos", true);
        request.getRequestDispatcher("/").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
