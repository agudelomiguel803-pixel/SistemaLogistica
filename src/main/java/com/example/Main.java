package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        CamionDeReparto miCamion = new CamionDeReparto("CAM-001", 80.0, 500.0, true);
        BuqueCarga miBuque = new BuqueCarga("BUQ-999", 90.0, 2000.0, 50);

    
        miCamion.setCombustible(-20.0);
        System.out.println("Combustible tras intento negativo: " + miCamion.getCombustible());

       
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(miCamion);
        flota.add(miBuque);

        
        for (Transporte t : flota) {
            t.viajar(100);
            System.out.println("Combustible restante: " + t.getCombustible());
        }
    }
}