package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);
    ArrayList<Libro> bibliotecas = new ArrayList();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;
        do {
            System.out.println("""
        --------------Biblioteca virtual -------------
        1. Agregar Libros
        2. Listar Los libros
        3. Buscar por titulo
        4. salir del programa
    """);
        System.out.print("Elija una opcion porfavor : ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> biblioteca.addLibro();
            case 2 -> biblioteca.FindByAll();
            case 3 -> biblioteca.findByTitle();
            case 4 -> {
                opcion = 0;
                System.out.println("Cerrando programa ...");
            }
            default -> System.out.println("Opcion invalido");
        }

        }while(opcion!=0);


    }

    public void addLibro(){
        Libro libro = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el libro : ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el autor del libro : ");
        String autor = sc.nextLine();
        System.out.print("Disponible si/no: ");
        String estado = sc.nextLine();
        boolean disponible = estado.equalsIgnoreCase("si");

        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setDisponible(disponible);

        bibliotecas.add(libro);

    }


    public void findByTitle(){
        System.out.print("Ingrese el titulo del libro aa buscar : ");
        String titulo = sc.nextLine();
        boolean encontrado = false;

        for (Libro libro : bibliotecas) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("---Libro encontrado----");
                System.out.println("Autor : " + libro.getAutor());
                System.out.println("Titulo : " + libro.getTitulo());
                System.out.println("Disponible : " + libro.isDisponible());
                encontrado = true;
            } else
                System.out.println("Libro no encontrado");

        }
    }





    public void FindByAll(){
        for (Libro libro : bibliotecas) {
            System.out.println(libro);
        }

    }




}

