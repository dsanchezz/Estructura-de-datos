package com.utez.edu;

class Coche extends Vehiculo implements IMotorDeGasolina{
    @Override
    public void cargarGas() {
        System.out.println("Cargando gasolina...");
    }

    @Override
    public void quemarGas() {
        System.out.println("BRBRBR...");
    }

    @Override
    void encender() {
        System.out.println("Coche encendido..");
    }

    @Override
    void apagar() {
        System.out.println("Coche apagado");
    }

    @Override
    void acelerar() {
        System.out.println("run run ruuun...");
    }

    @Override
    void frenar() {
        System.out.println("ighhhh...");
    }

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.encender();
        coche.quemarGas();
        coche.acelerar();
        coche.frenar();
        coche.apagar();
        coche.cargarGas();
    }
}
