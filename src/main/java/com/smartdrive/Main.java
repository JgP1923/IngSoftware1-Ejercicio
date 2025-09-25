package com.smartdrive;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Lista de vehículos para probar que funcionan los metodos
        ArrayList<Vehiculo> Concesionario = new ArrayList<>();

        //Se crean los tres tipos de vehículos para ejemplos
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

            //si el vehiculo es electrico muestra sus metodos propios
            if (v instanceof Electrico) {
                Electrico e = (Electrico) v;
                e.CargarBateria();
                e.ActivarPilotoAutomatico();
                e.ActivarAsistenciaEmergencias();
                e.Conducir();
            //si el vehiculo es hibrido muestra sus metodos propios   
            } else if (v instanceof Hibrido) {
                Hibrido h = (Hibrido) v;
                h.cambiarModo();
                h.ActivarPilotoAutomatico();
            //si el vehiculo es de combustion muestra los metodos propios   
            } else if (v instanceof Combustion) {
                Combustion c = (Combustion) v;
                c.Repostar();
            }

            System.out.println("---------------------------------");
        }
    }
}
