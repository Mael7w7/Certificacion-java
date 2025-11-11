package org.example;

import java.util.List;

public class Alumno {
    private String nombre;
    private String carrera;
    private List<Double> listaNotas;

    public Alumno(String nombre, List<Double> listaNotas, String carrera) {
        this.nombre = nombre;
        this.listaNotas = listaNotas;
        this.carrera = carrera;
    }
    public Alumno() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", listaNotas=" + listaNotas +
                '}';
    }
}
