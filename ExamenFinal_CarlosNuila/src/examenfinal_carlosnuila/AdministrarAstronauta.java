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
public class AdministrarAstronauta {
    
    private ArrayList<Astronauta> listaAstronauta = new ArrayList();
    private File archivo = null;

    public AdministrarAstronauta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Astronauta> getListaAstronauta() {
        return listaAstronauta;
    }

    public void setListaAstronauta(ArrayList<Astronauta> listaAstronauta) {
        this.listaAstronauta = listaAstronauta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaAstronauta=" + listaAstronauta;
    }

    //extra mutador
    public void setAstronauta(Astronauta a) {
        this.listaAstronauta.add(a);
    }

    public void cargarArchivo() {
        try {            
            listaAstronauta = new ArrayList();
            Astronauta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Astronauta) objeto.readObject()) != null) {
                        listaAstronauta.add(temp);
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
            for (Astronauta t : listaAstronauta) {
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
