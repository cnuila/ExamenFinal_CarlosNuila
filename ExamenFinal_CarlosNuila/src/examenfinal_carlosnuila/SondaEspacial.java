/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_carlosnuila;

import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public class SondaEspacial extends NaveEspacial{
    
    private String material;
    private double peso;

    public SondaEspacial() {
    }

    public SondaEspacial(String material, double peso, int numeroSerie, Planeta planetaDestino, double velocidad) {
        super(numeroSerie, planetaDestino, velocidad);
        this.material = material;
        this.peso = peso;
        tipo = "Sonda Espacial";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public ArrayList<Double> calcularTiempo(double distancia) {
        ArrayList<Double> temporal = new ArrayList();
        double ida = distancia / velocidad;
        double vuelta = 9.8 * velocidad;
        temporal.add(ida);
        temporal.add(vuelta);
        return temporal;
    }
    
}
