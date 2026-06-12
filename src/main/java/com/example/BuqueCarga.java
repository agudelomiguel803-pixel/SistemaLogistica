package com.example;

public class BuqueCarga extends Transporte {
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque " + getIdTransporte() + " está listo para descarga.");
    }

    public void mostrarDatos() {
        double costoViaje = getCapacidadCarga() * 10;
        System.out.println("ID: " + getIdTransporte() + " | Contenedores: " + cantidadContenedores + " | Costo: $" + costoViaje);
    }
}