package org.example;


public class Main {
    public static void main(String[] args) {

        Dispositivos dispositivos = new Dispositivos("h5","lenovo",1500);

        Laptop laptop = new Laptop(dispositivos);
        laptop.setProcesador("Intel i5");
        laptop.setMemoriaRAM(3200);
        laptop.setTamañoPantalla(19);
        laptop.detalles();

        //--------------------------------------
        Dispositivos dispositivos2 = new Dispositivos("h589","Epson",500);
        Impresora impresora = new Impresora(dispositivos2);
        impresora.setTipo("Lacer");
        impresora.setMultifuncional(true);
        impresora.setCapacidadHojas(100);
        impresora.detalles();

    }
}