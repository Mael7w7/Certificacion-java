package org.example.servicio;

import org.example.modelo.Estado;
import org.example.modelo.Prioridad;
import org.example.modelo.Tarea;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GestorTareas {
    private List<Tarea> tareas = new ArrayList<Tarea>();
    Scanner teclado = new Scanner(System.in);

    //Crear tarea
    public Tarea addTarea(String titulo, String descripcion,
                          Prioridad prioridad, LocalDateTime fechaLimite) {
        System.out.print("Ingrese el titulo porfavor :");
        titulo = teclado.nextLine();
        System.out.print("Ingrese el descripcion porfavor :");
        descripcion = teclado.nextLine();


        System.out.print("Ingrese la prioridad (BAJA, MEDIA, ALTA):");
        String prioridadInput = teclado.nextLine().toUpperCase();

        //se convierte el texto en un enum
        prioridad = Prioridad.valueOf(prioridadInput);

        System.out.print("Ingrese la fecha de limite porfavor :");
        String fechaLimiteInput = teclado.nextLine();
        fechaLimite = LocalDateTime.parse(fechaLimiteInput);

        //creamos las tareas

        Tarea tarea = new Tarea();
        tarea.setTitulo(titulo);
        tarea.setDescripcion(descripcion);
        tarea.setPrioridad(prioridad);
        tarea.setFechaLimite(fechaLimite);
        tareas.add(tarea);
        return tarea;
    }

    public Tarea updateEstado(Estado estado,Long id) {
        System.out.print("Ingrese el id porfavor : ");
         id = teclado.nextLong();
        teclado.nextLine(); // limpiar buffer
        System.out.print("Ingrese el nuevo estado porfavor :");
        String estadoInput = teclado.nextLine().toUpperCase();
        //convertimos el texto en enum
        try {
            estado = Estado.valueOf(estadoInput);
        }catch (IllegalArgumentException e){
            System.out.println("Estado invalido");
            return null;
        }
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.setEstado(estado);
                return t;
            }
        }
        System.out.println("No se encontró ninguna tarea con ese ID.");
        return null;
    }

    public Tarea updatePrioridad(Prioridad prioridad,Long id) {
        System.out.print("Ingrese el id porfavor : ");
        id= teclado.nextLong();
        teclado.nextLine();
        System.out.print("Ingrese el nuevo prioridad porfavor :");
        String prioridadInput = teclado.nextLine().toUpperCase();

        //de texto a enum
        try{
            prioridad = Prioridad.valueOf(prioridadInput);
        }catch(IllegalArgumentException e){
            System.out.println("Prioridad invalido");
            return null;
        }
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.setPrioridad(prioridad);
                return t;
            }
        }
        return null;
    }

    public List<Tarea> findByPrioridad(Prioridad prioridad) {
        List<Tarea> tar = new ArrayList<>();
        System.out.print("Ingrese la prioridad porfavor :");
        String prioridadInput = teclado.nextLine().toUpperCase();

        //texto a enum
        try {
            prioridad = Prioridad.valueOf(prioridadInput);

        }catch (IllegalArgumentException e){
            System.out.println("Prioridad invalido");
            return null;
        }
        for (Tarea t : tareas) {
            if (t.getPrioridad().equals(prioridad)) {
                tar.add(t);
                System.out.println(t);
            }
        }

        return tar;

    }

    public List<Tarea> findByEstado(Estado estado) {
        List<Tarea> tar = new ArrayList<>();
        System.out.print("Ingrese la estado porfavor :");
        String estadoInput = teclado.nextLine().toUpperCase();
        //de texto a enum
        try {
            estado = Estado.valueOf(estadoInput);
        }catch (IllegalArgumentException e){
            System.out.println("Estado invalido");
            return null;
        }
        for (Tarea t : tareas) {

            if (t.getEstado().equals(estado)) {
                tar.add(t);
                System.out.println(t);
            }

        }
        return tar;
    }

    public List<Tarea> findByEtiquets() {
        List<Tarea> tar = new ArrayList<>();
        System.out.println("Ingrese la etiquets porfavor :");
        String etiqueta = teclado.nextLine();
        for (Tarea t : tareas) {
                if (t.getEtiquetas().contains(etiqueta)) {
                    tar.add(t);
                    System.out.println(t);

                }

        }
        return tar;
    }

    public List<Tarea> listarPorOrdenPrioridad(Prioridad prioridad) {
        List<Tarea> tar1 = new ArrayList<>();

        for (Tarea t : tareas) {
            if (t.getPrioridad() ==prioridad.ALTA) {
                tar1.add(t);
                System.out.println(t);

            }
            }

        for (Tarea t2 : tareas) {
            if (t2.getPrioridad()==prioridad.MEDIA) {
                tar1.add(t2);
                System.out.println(t2);

            }

        }
        for (Tarea t3 : tareas) {
            if (t3.getPrioridad()==prioridad.BAJA) {
                tar1.add(t3);
                System.out.println(t3);

            }
        }
        return tar1;
    }

    public List<Tarea> listarPorFechaLimite(Tarea tarea){
        List<Tarea> tar = new ArrayList<>(tareas);
        tar.sort(Comparator.comparing(Tarea::getFechaLimite));
        return tar;


    }

    public void deleteTarea() {
        System.out.print("Ingrese el id a eliminar : ");
        Long id = teclado.nextLong();
        try {
            for (Tarea t : tareas) {
                if (t.getId() == id) {
                    tareas.remove(t);
                    System.out.println("*** Tarea eliminado ***");
                }
                else
                    System.out.println("*** Tarea no eliminado ***");
            }


        }catch (IllegalArgumentException e){
            System.out.println("El id del tarea no existe");
        }
    }

}

