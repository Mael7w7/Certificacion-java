package org.example;



public class Laptop extends Dispositivos{

    private int memoriaRAM;
    private String procesador;
    private double tamañoPantalla;
    private Dispositivos dispo;

    public Laptop(String modelo, String marca, double precio, Dispositivos dispo, double tamañoPantalla, String procesador, int memoriaRAM) {
        super(modelo, marca, precio);
        this.dispo = dispo;
        this.tamañoPantalla = tamañoPantalla;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public Laptop( Dispositivos dispo) {
        this.dispo = dispo;
    }

    public Laptop(Dispositivos dispo, double tamañoPantalla, String procesador, int memoriaRAM) {
        this.dispo = dispo;
        this.tamañoPantalla = tamañoPantalla;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public Laptop(){

    }

    @Override
    public void detalles(){
        System.out.println("Laptop{" +
                "memoriaRAM=" + memoriaRAM +
                ", procesador='" + procesador + '\'' +
                ", tamañoPantalla=" + tamañoPantalla +
                ", dispo=" + dispo +
                '}');
    }



    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public Dispositivos getDispo() {
        return dispo;
    }

    public void setDispo(Dispositivos dispo) {
        this.dispo = dispo;
    }
}
