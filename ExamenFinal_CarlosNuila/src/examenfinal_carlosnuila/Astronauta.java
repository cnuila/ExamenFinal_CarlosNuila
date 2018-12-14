/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_carlosnuila;

import java.io.Serializable;

/**
 *
 * @author Carlos Nuila
 */
public class Astronauta implements Serializable {
    
    private String nombre;
    private String nacionalidad;
    private double sueldo;
    private int añoExperiencia;
    private String sexo;
    private double peso;
    
    private static final long SerialVersionUID = 1008;

    public Astronauta() {
    }

    public Astronauta(String nombre, String nacionalidad, double sueldo, int añoExperiencia, String sexo, double peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.añoExperiencia = añoExperiencia;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAñoExperiencia() {
        return añoExperiencia;
    }

    public void setAñoExperiencia(int añoExperiencia) {
        this.añoExperiencia = añoExperiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    
    
    
}
