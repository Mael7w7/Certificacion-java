package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNombre("Angel Hidalgo Curo");
    cliente.setDni("73635273");
    CuentaBancaria cuenta = new CuentaBancaria(10.0,cliente);
    cuenta.depositar(100.0);
    cuenta.retirar(80.0);
        System.out.println(cuenta.consultarSaldo());

    }
}