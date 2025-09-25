package com.smartdrive;

public class Combustion extends Vehiculo implements Conducible {
    //implementacion atributo propio de vehiculo de combustion
    private double capacidadTanque;

    //llamado a la clase vehiculo para generar el vehiculo de combustion
    public Combustion(String marca, String modelo, int year, double velocidadMaxima, double capacidadTanque) {
        super(marca, modelo, year, velocidadMaxima);
        this.capacidadTanque = capacidadTanque;
    }

    //metodo propio de repostar para la clase combustion
    public void Repostar() {
        System.out.println("El vehiculo de combustion " + marca + " " + modelo + " está repostando combustible.");
    }

    //metodo que se llama desde la clase vehiculo
    @Override
    public void Conducir() {
        System.out.println("El vehiculo de combustion " + marca + " " + modelo + " está siendo conducido manualmente.");
    }
}

