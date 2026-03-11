package com.herencia;

public class CuentaCorriente extends Cuenta {

    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
        } else {
            sobregiro = sobregiro + (cantidad - saldo);
            saldo = 0;
        }
        retiros++;
    }

    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad = cantidad - sobregiro;
                sobregiro = 0;
                saldo = saldo + cantidad;
            } else {
                sobregiro = sobregiro - cantidad;
            }
        } else {
            saldo = saldo + cantidad;
        }
        consignaciones++;
    }

    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        int transacciones = consignaciones + retiros;
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Transacciones: " + transacciones);
        System.out.println("Sobregiro: " + sobregiro);
    }
}
