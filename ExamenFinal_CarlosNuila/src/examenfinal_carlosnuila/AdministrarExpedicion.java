/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_carlosnuila;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Nuila
 */
public class AdministrarExpedicion extends Thread {

    private NaveTripulada naveTripulada;
    private SondaEspacial sondaEspacial;
    private JTable tabla;
    private boolean avanzar;
    private boolean vive;
    private int flag;
    private int posicionEnTabla;
    private long tiempoida;
    private long tiempoVuelta;
    private ArrayList<Double> tiempo;

    public AdministrarExpedicion(SondaEspacial sondaEspacial, boolean avanzar, JTable tabla) {
        this.sondaEspacial = sondaEspacial;
        this.tabla = tabla;
        vive = true;
        flag = 0;
        tiempo = sondaEspacial.calcularTiempo(sondaEspacial.getPlanetaDestino().getDistanciaAtierra());

    }

    public AdministrarExpedicion(NaveTripulada naveTripulada, boolean avanzar, JTable tabla) {
        this.naveTripulada = naveTripulada;
        this.tabla = tabla;
        vive = true;
        flag = 0;
        tiempo = naveTripulada.calcularTiempo(naveTripulada.getPlanetaDestino().getDistanciaAtierra());
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        tiempoida = Math.round(tiempo.get(0) * 1000);
        tiempoVuelta = Math.round(tiempo.get(1) * 1000);
        System.out.println(tiempoida);
        System.out.println(tiempoVuelta);
        while (vive) {
            DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
            if (flag == 0){
                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

    public void llenarTabla() {
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nave", "LLegó", "Regresó"
                }
        ));

    }

}
