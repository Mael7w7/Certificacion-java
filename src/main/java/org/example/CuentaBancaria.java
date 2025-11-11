package org.example;

public class CuentaBancaria {
    private Double saldo;
    private final Cliente cliente;

    public CuentaBancaria(Double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double depositar(double valor) {
        this.saldo += valor;
        System.out.println("El deposito fue un exito : " +saldo);
        return saldo;

    }

    public Double retirar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        }else
            System.out.println("El retiro no pudo ser mayor al saldo");

        System.out.println("El retiro fue un exito : " +saldo);
        return saldo;
    }



    public String consultarSaldo() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
