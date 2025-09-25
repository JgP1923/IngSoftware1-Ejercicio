package com.smartdrive;

public abstract class Vehiculo {
   //Atributos que tiene la clase vehiculo
    protected String marca;
    protected String modelo;
    protected int year;
    protected double velocidadMaxima;

    //Para crear vehiculos
    public Vehiculo(String marca, String modelo, int year, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos que vienen con la clase
    public void Acelerar() {
        System.out.println("El vehiculo " + marca + " " + modelo + " está acelerando.");
    }

    public void Frenar() {
        System.out.println("El vehiculo " + marca + " " + modelo + " está Frenando.");
    }

    public void InformacionGeneral() {
        System.out.println("Marca: " + marca + 
                           ", Modelo: " + modelo + 
                           ", Año: " + year + 
                           ", Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

