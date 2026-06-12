package com.example;

public class CamionDeReparto extends Transporte {
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion){
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }
 @Override
    public void viajar(int distancia) {
        double consumo;
        
        
        if (tieneRefrigeracion == true) {
            consumo = (distancia / 10.0) * 2.0; 
        } else {
            consumo = (distancia / 10.0) * 1.0; 
        }
        
       
        double nuevoNivel = getCombustible() - consumo;
        setCombustible(nuevoNivel);
        
        System.out.println("Camión " + getIdTransporte() + " viajó. Consumo ajustado: " + consumo);
    }
}

