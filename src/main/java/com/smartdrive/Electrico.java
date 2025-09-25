package com.smartdrive;

public class Electrico extends Vehiculo implements AutonomiaAvanzada {
    private double capacidadBateria;

    public Electrico(String marca, String modelo, int year, double velocidadMaxima, double capacidadBateria) {
        super(marca, modelo, year, velocidadMaxima);
        this.capacidadBateria = capacidadBateria;
    }

    public void CargarBateria() {
        System.out.println("El vehiculo " + marca + " " + modelo + " está cargando la batería.");
    }

    @Override
    public void Conducir() {
        System.out.println("El vehiculo " + marca + " " + modelo + " está siendo conducido manualmente.");
    }

    @Override
    public void ActivarPilotoAutomatico() {
        System.out.println("El vehiculo " + marca + " " + modelo + " activó el piloto automático.");
    }

    @Override
    public void ActivarAsistenciaEmergencias() {
        System.out.println("El vehiculo " + marca + " " + modelo + " activó la asistencia en emergencias.");
    }
}
