package org.example;


import org.example.servicio.GestorTareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestorTareas gestorTareas = new GestorTareas();
        int opcion = 1;


        try {

            do {
                System.out.print("""
                        **** MENU DE INTERACCION ****
                        1. Crear tarea
                        2. Actualizar estado
                        3. Actualizar prioridad
                        4. Buscar por prioridad
                        5. Buscar por estado 
                        6. Buscar por etiqueta
                        7. Mostrar todas (por prioridad)
                        8. Mostrar todas (por fecha limite)
                        9. Eliminar Tarea
                        0. Salir
                        Escriba una opcion porfavor : """);
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1 -> gestorTareas.addTarea(null, null, null, null);
                    case 2 -> gestorTareas.updateEstado(null, null);
                    case 3 -> gestorTareas.updatePrioridad(null, null);
                    case 4 -> gestorTareas.findByPrioridad(null);
                    case 5 -> gestorTareas.findByEstado(null);
                    case 6 -> gestorTareas.findByEtiquets();
                    case 7 -> gestorTareas.listarPorOrdenPrioridad(null);
                    case 8 -> gestorTareas.listarPorFechaLimite(null);
                    case 9 -> gestorTareas.deleteTarea();
                    default -> System.out.println("Opcion invalido");
                }

            } while (opcion != 0);


        }catch (InputMismatchException e){
            System.out.println("Opcion invalido");
        }
    }
    }






