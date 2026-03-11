package com.herencia;

public class Main {

    public static void main(String[] args) {

        CuentaAhorros cuenta = new CuentaAhorros(15000, 5);

        cuenta.consignar(5000);
        cuenta.retirar(2000);
        cuenta.retirar(2000);
        cuenta.retirar(2000);
        cuenta.retirar(2000);
        cuenta.retirar(2000);

        cuenta.extractoMensual();

        cuenta.imprimir();
    }
}