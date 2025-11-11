package org.example;

public class Impresora extends Dispositivos {
    private String tipo;         // Inyección, láser, térmica, etc.
    private boolean multifuncional;  // Si también escanea/copias
    private int capacidadHojas;      // Número de hojas que soporta
    Dispositivos dispo;

    public Impresora(String modelo, String marca, double precio) {
        super(modelo, marca, precio);
    }

    public Impresora(Dispositivos dispo) {
        this.dispo = dispo;
    }

    public Impresora(){

    }



    @Override
    public void detalles(){
        System.out.println("Impresora{" +
                "tipo='" + tipo + '\'' +
                ", multifuncional=" + multifuncional +
                ", capacidadHojas=" + capacidadHojas +
                ", dispo=" + dispo +
                '}');

    }

    public boolean isMultifuncional() {
        return multifuncional;
    }

    public void setMultifuncional(boolean multifuncional) {
        this.multifuncional = multifuncional;
    }

    public int getCapacidadHojas() {
        return capacidadHojas;
    }

    public void setCapacidadHojas(int capacidadHojas) {
        this.capacidadHojas = capacidadHojas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Dispositivos getDispo() {
        return dispo;
    }

    public void setDispo(Dispositivos dispo) {
        this.dispo = dispo;
    }
}
