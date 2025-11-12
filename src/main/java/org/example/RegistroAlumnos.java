package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class RegistroAlumnos {

    // 🔹 HashMap donde la clave es el DNI y el valor es el objeto Alumno
    private HashMap<String, Alumno> mapaAlumnos = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void agregarAlumno() {
        System.out.print("Ingrese DNI: ");
        String dni = sc.nextLine();

        // Verificar si el DNI ya existe
        if (mapaAlumnos.containsKey(dni)) {
            System.out.println("⚠️ Ya existe un alumno con ese DNI.");
            return;
        }

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Alumno alumno = new Alumno(nombre,edad,dni);
        mapaAlumnos.put(dni, alumno);

        System.out.println("✅ Alumno agregado correctamente.");
    }

    public void buscarAlumno() {
        System.out.print("Ingrese DNI a buscar: ");
        String dni = sc.nextLine();

        Alumno alumno = mapaAlumnos.get(dni);
        if (alumno != null) {
            System.out.println("🔍 Alumno encontrado: " + alumno);
        } else {
            System.out.println("❌ No existe alumno con ese DNI.");
        }
    }

    public void eliminarAlumno() {
        System.out.print("Ingrese DNI del alumno a eliminar: ");
        String dni = sc.nextLine();

        if (mapaAlumnos.remove(dni) != null) {
            System.out.println("🗑️ Alumno eliminado correctamente.");
        } else {
            System.out.println("❌ No se encontró un alumno con ese DNI.");
        }
    }

    public void mostrarTodos() {
        if (mapaAlumnos.isEmpty()) {
            System.out.println("⚠️ No hay alumnos registrados.");
        } else {
            System.out.println("\n📋 Lista de alumnos registrados:");
            mapaAlumnos.forEach((dni, alumno) -> {
                System.out.println(dni + " → " + alumno);
            });
        }
    }

    public static void main(String[] args) {
        RegistroAlumnos registro = new RegistroAlumnos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ REGISTRO DE ALUMNOS =====");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Buscar alumno por DNI");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> registro.agregarAlumno();
                case 2 -> registro.buscarAlumno();
                case 3 -> registro.eliminarAlumno();
                case 4 -> registro.mostrarTodos();
                case 0 -> System.out.println("👋 Saliendo del programa...");
                default -> System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }
}

