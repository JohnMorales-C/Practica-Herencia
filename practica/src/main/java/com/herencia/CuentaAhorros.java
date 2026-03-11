package com.herencia;

public class CuentaAhorros extends Cuenta {

    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        }
    }

    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        }
    }

    public void extractoMensual() {
        if (retiros > 4) {
            comisionMensual = (retiros - 4) * 1000;
        }

        super.extractoMensual();

        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    public void imprimir() {
        int transacciones = consignaciones + retiros;
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Transacciones: " + transacciones);
    }
}
