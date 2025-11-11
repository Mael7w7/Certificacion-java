package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno() ;

        alumno.setNombre("Angel Hidalgo Curo");
        alumno.setCarrera("Ingenieria de sistemas");
        List<Double> listaNotas = new ArrayList<Double>();

        listaNotas.add(12.0);
        listaNotas.add(15.8);
        listaNotas.add(12.9);
        listaNotas.add(11.6);
        alumno.setListaNotas(listaNotas);

        Metodos metodos = new Metodos(alumno);

        metodos.AgregarNotas(10);
        metodos.mostrarInfo();
        metodos.CalcularNotas();
        metodos.notaFinal();



    }
}