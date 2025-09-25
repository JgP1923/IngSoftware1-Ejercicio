package com.smartdrive;

public class Hibrido extends Vehiculo implements Autonomo {
    //añadimos el atributo propio de la clase hibrido
    private double eficienciaEnergetica;

    //se traen los atributos de la clase vehiculo y el atributo que corresponde a ser hibrido
    public Hibrido(String marca, String modelo, int year, double velocidadMaxima, double eficienciaEnergetica) {
        super(marca, modelo, year, velocidadMaxima);
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    //metodo propio de los hibridos
    public void cambiarModo() {
        System.out.println("El vehiculo hibrido " + marca + " " + modelo + " cambió de modo de funcionamiento.");
    }

    //metodos que se traen de vehiculos 
    @Override
    public void Conducir() {
        System.out.println("El vehiculo hibrido " + marca + " " + modelo + " está siendo conducido manualmente.");
    }

    @Override
    public void ActivarPilotoAutomatico() {
        System.out.println("El vehiculo hibrido " + marca + " " + modelo + " activó el piloto automático.");
    }
}

