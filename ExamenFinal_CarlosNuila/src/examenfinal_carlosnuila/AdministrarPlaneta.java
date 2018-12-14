/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_carlosnuila;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public class AdministrarPlaneta {
     private ArrayList<Planeta> listaPlanetas = new ArrayList();
    private File archivo = null;

    public AdministrarPlaneta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Planeta> getlistaPlanetas() {
        return listaPlanetas;
    }

    public void setlistaPlanetas(ArrayList<Planeta> listaPlanetas) {
        this.listaPlanetas = listaPlanetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPlanetas=" + listaPlanetas;
    }

    //extra mutador
    public void setPlaneta(Planeta p) {
        this.listaPlanetas.add(p);
    }

    public void cargarArchivo() {
        try {            
            listaPlanetas = new ArrayList();
            Planeta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Planeta) objeto.readObject()) != null) {
                        listaPlanetas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Planeta t : listaPlanetas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
