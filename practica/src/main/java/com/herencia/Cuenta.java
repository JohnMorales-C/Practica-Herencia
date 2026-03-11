package com.herencia;

public class Cuenta {

    protected float saldo;
    protected int consignaciones = 0;
    protected int retiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        consignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            retiros++;
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = saldo * (tasaAnual / 12 / 100);
        saldo = saldo + interesMensual;
    }

    public void extractoMensual() {
        saldo = saldo - comisionMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Consignaciones: " + consignaciones);
        System.out.println("Retiros: " + retiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comision mensual: " + comisionMensual);
    }
}