package com.utez.edu;

public class Avion extends Vehiculo implements IMotorDeGasolina{

    @Override
    public void cargarGas() {
        System.out.println("Cargando gasolina");
    }

    @Override
    public void quemarGas() {
        System.out.println("Fiuuuuum");
    }

    @Override
    void encender() {
        System.out.println("Avión encendido");
    }

    @Override
    void apagar() {
        System.out.println("Avión apagado");
    }

    @Override
    void acelerar() {
        System.out.println("shuuuuuu");
    }

    @Override
    void frenar() {
        System.out.println("Frenando...");
    }

    public static void main(String[] args) {
        Avion avion = new Avion();
        avion.encender();
        avion.quemarGas();
        avion.acelerar();
        avion.frenar();
        avion.apagar();
        avion.cargarGas();
    }
}
