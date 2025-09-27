package com.smartdrive;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista de vehículos para probar que funcionan los metodos
        ArrayList<Vehiculo> Concesionario = new ArrayList<>();

        // Se crean los tres tipos de vehículos para ejemplos
        Electrico tesla = new Electrico("Tesla", "Model S", 2024, 250, 100);
        Hibrido toyota = new Hibrido("Toyota", "Prius", 2022, 180, 85);
        Combustion ford = new Combustion("Ford", "Mustang", 2021, 260, 60);

        // Los agregamos a nuestro concesionario
        Concesionario.add(tesla);
        Concesionario.add(toyota);
        Concesionario.add(ford);

        // Recorrer el arreglo para mostrar la informacion de cada vehiculo
        for (Vehiculo v : Concesionario) {
            v.InformacionGeneral();
            v.Acelerar();
            v.Frenar();

            if (v instanceof Conducible c) {
                c.Conducir();
            }
            if (v instanceof Autonomo a) {
                a.ActivarPilotoAutomatico();
            }
            if (v instanceof AutonomiaAvanzada aa) {
                aa.ActivarAsistenciaEmergencias();
            }

            // Métodos propios de cada clase
            if (v instanceof Electrico e) {
                e.CargarBateria();
            } else if (v instanceof Hibrido h) {
                h.cambiarModo();
            } else if (v instanceof Combustion c) {
                c.Repostar();
            }

            System.out.println("---------------------------------");
        }
    }
}
