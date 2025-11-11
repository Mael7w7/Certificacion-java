package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Angel Hidalgo Curo");
        empleado.setSalario(1000.00);
        empleado.setPuesto("Empleado");
        System.out.println(empleado);
        System.out.println("Sueldo total : "+empleado.aumentarSalario(10));

        System.out.println("--------------------------------------------------------------------");
        Gerente gerente = new Gerente();
        gerente.setNombre("Camila ramirez");
        gerente.setSalario(2000.00);
        gerente.setPuesto("Gerente");
        gerente.setBono(300.00);
        System.out.println(gerente);
        System.out.println("Sueldo total " +gerente.calcularSalario());


    }
}