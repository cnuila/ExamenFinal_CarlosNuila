/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_carlosnuila;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public abstract class NaveEspacial implements Serializable {
    
    protected int numeroSerie;
    protected Planeta planetaDestino;
    protected double velocidad;
    
    private static final long SerialVersionUID = 1098L;

    public NaveEspacial() {
    }

    public NaveEspacial(int numeroSerie, Planeta planetaDestino, double velocidad) {
        this.numeroSerie = numeroSerie;
        this.planetaDestino = planetaDestino;
        this.velocidad = velocidad;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Planeta getPlanetaDestino() {
        return planetaDestino;
    }

    public void setPlanetaDestino(Planeta planetaDestino) {
        this.planetaDestino = planetaDestino;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public abstract ArrayList<Double> calcularTiempo(double distancia);
    
    
}
