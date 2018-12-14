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
public class NaveTripulada extends NaveEspacial{
    
    private String lugarDespeje;
    private ArrayList<Astronauta> listaAstronautas = new  ArrayList();

    public NaveTripulada() {
    }
    
    public NaveTripulada(String lugarDespeje, int numeroSerie, Planeta planetaDestino, double velocidad) {
        super(numeroSerie, planetaDestino, velocidad);
        this.lugarDespeje = lugarDespeje;
        tipo = "Nave Tripulada";
    }

    public String getLugarDespeje() {
        return lugarDespeje;
    }

    public void setLugarDespeje(String lugarDespeje) {
        this.lugarDespeje = lugarDespeje;
    }

    public ArrayList<Astronauta> getListaAstronautas() {
        return listaAstronautas;
    }

    public void setListaAstronautas(ArrayList<Astronauta> listaAstronautas) {
        this.listaAstronautas = listaAstronautas;
    }

    @Override
    public ArrayList<Double> calcularTiempo(double distancia) {
        ArrayList<Double> temporal = new ArrayList();
        double todosPesos = 0;
        for (Astronauta temp : listaAstronautas) {
            todosPesos += temp.getPeso();
        }
        double ida = distancia / (velocidad * (Math.pow(todosPesos, 2)/100));
        double vuelta = distancia / (velocidad * (todosPesos/100));
        temporal.add(ida);
        temporal.add(vuelta);
        velocidad = ida;
        return temporal;
    }
    
    
            
    
}
