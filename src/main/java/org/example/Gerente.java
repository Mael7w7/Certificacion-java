package org.example;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(Double salario, String puesto, String nombre) {
        super(salario, puesto, nombre);
    }
    public Gerente(){

    }


    @Override
    public double calcularSalario() {
        double total = aumentarSalario(10) + this.bono;
        return total;

    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
