package org.example;

public class Empleado {
    private String nombre;
    private Double salario;
    private String puesto;

    public Empleado(Double salario, String puesto, String nombre) {
        this.salario = salario;
        this.puesto = puesto;
        this.nombre = nombre;
    }
    public Empleado() {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double porcentaje) {
        double total = this.salario + (this.salario * porcentaje)/100;
        return total;
    }

    public double calcularSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
