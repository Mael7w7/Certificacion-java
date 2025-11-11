package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Producto pro = new Producto();
    pro.setNombre("Angel Hidalgo");
    pro.setStock(20);
    pro.setPrecio("320");
    metodos metodos = new metodos(pro);

    System.out.println("-------Producto--------");
        metodos.mostrarInfo();
        metodos.vender(30);
        metodos.reponer(9);
        metodos.mostrarInfo();

    }
}