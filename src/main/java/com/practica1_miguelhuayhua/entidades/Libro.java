package com.practica1_miguelhuayhua.entidades;

/**
 *
 * @author miguel
 */
public class Libro {

    private String titulo, autor, resumen, medio;

    public Libro(String titulo, String autor, String resumen, String medio) {
        this.titulo = titulo;
        this.autor = autor;
        this.resumen = resumen;
        this.medio = medio;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

}
