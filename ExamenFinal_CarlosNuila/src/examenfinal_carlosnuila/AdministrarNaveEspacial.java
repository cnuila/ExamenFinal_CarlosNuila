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
public class AdministrarNaveEspacial {
    
    private ArrayList<NaveEspacial> listaNaveEspacial = new ArrayList();
    private File archivo = null;

    public AdministrarNaveEspacial(String path) {
        archivo = new File(path);
    }

    public ArrayList<NaveEspacial> getlistaNaveEspacial() {
        return listaNaveEspacial;
    }

    public void setlistaNaveEspacial(ArrayList<NaveEspacial> listaNaveEspacial) {
        this.listaNaveEspacial = listaNaveEspacial;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaNaveEspacial=" + listaNaveEspacial;
    }

    //extra mutador
    public void setNaveEspacial(NaveEspacial n) {
        this.listaNaveEspacial.add(n);
    }

    public void cargarArchivo() {
        try {            
            listaNaveEspacial = new ArrayList();
            NaveEspacial temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (NaveEspacial) objeto.readObject()) != null) {
                        listaNaveEspacial.add(temp);
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
            for (NaveEspacial t : listaNaveEspacial) {
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
