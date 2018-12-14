/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_carlosnuila;

/**
 *
 * @author Carlos Nuila
 */
public class Planeta {
    
    private String nombre;
    private double temperaturaMedia;
    private boolean anillos;
    private String tipoSuperficie;
    private double distanciaAtierra;

    public Planeta() {
    }
    
    public Planeta(String nombre, double temperaturaMedia, boolean anillos, String tipoSuperficie, double distanciaAtierra) {
        this.nombre = nombre;
        this.temperaturaMedia = temperaturaMedia;
        this.anillos = anillos;
        this.tipoSuperficie = tipoSuperficie;
        this.distanciaAtierra = distanciaAtierra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public void setTipoSuperficie(String tipoSuperficie) {
        this.tipoSuperficie = tipoSuperficie;
    }

    public double getDistanciaAtierra() {
        return distanciaAtierra;
    }

    public void setDistanciaAtierra(double distanciaAtierra) {
        this.distanciaAtierra = distanciaAtierra;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
