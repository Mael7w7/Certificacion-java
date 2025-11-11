package org.example;

public class Producto {
    private String nombre;
    private  String precio;
    private  Integer stock;


    public Producto() {

    }
    public Producto(String precio, Integer stock, String nombre) {
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
