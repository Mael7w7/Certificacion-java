package org.example;


public class Dispositivos {

    private String marca;
    private String modelo;
    private double precio;

    public Dispositivos(String modelo, String marca, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }
    public Dispositivos() {

    }

    public void detalles(){
        System.out.println("Dispositivos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}');
    }

    @Override
    public String toString() {
        return "Dispositivos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


