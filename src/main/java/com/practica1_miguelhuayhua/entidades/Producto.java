package com.practica1_miguelhuayhua.entidades;

public class Producto {

    private String producto, categoria;
    private int existencia;
    private float precio;

    public Producto(String producto, String categoria, int existencia, float precio) {
        this.producto = producto;
        this.categoria = categoria;
        this.existencia = existencia;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
