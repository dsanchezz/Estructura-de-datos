package com.utez.edu;

class Barco extends Vehiculo implements IMotorDeGasolina {
    @Override
    public void cargarGas() {
        System.out.println("Cargando gasolina...");
    }

    @Override
    public void quemarGas() {
        System.out.println("Quemando gasolina KUH...");
    }

    @Override
    void encender() {
        System.out.println("Encendiendo barco...");
    }

    @Override
    void apagar() {
        System.out.println("Apagando barco...");
    }

    @Override
    void acelerar() {
          System.out.println("MMMMMM...");
    }

    @Override
    void frenar() {
        System.out.println("Frenando barco...");
    }

    public static void main(String[] args) {
        Barco barco = new Barco();

        barco.encender();
        barco.quemarGas();
        barco.acelerar();
        barco.frenar();
        barco.apagar();
        barco.cargarGas();
    }
}
