package com.smartdrive;

public class Electrico extends Vehiculo implements AutonomiaAvanzada {
    //se crea su atributo propio
    private double capacidadBateria;

    //se utilizan los atributos de la clase vehiculo y su propio atributo
    public Electrico(String marca, String modelo, int year, double velocidadMaxima, double capacidadBateria) {
        super(marca, modelo, year, velocidadMaxima);
        this.capacidadBateria = capacidadBateria;
    }

    //metodo de cargar la bateria
    public void CargarBateria() {
        System.out.println("El vehiculo electrico " + marca + " " + modelo + " está cargando la batería.");
    }

    //metodos que se traen de la clase de vehiculo
    @Override
    public void Conducir() {
        System.out.println("El vehiculo electrico " + marca + " " + modelo + " está siendo conducido manualmente.");
    }

    @Override
    public void ActivarPilotoAutomatico() {
        System.out.println("El vehiculo electrico " + marca + " " + modelo + " activó el piloto automático.");
    }

    @Override
    public void ActivarAsistenciaEmergencias() {
        System.out.println("El vehiculo electrico " + marca + " " + modelo + " activó la asistencia en emergencias.");
    }
}
