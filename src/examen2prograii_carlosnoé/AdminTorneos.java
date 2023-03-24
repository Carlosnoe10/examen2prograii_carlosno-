package examen2prograii_carlosnoé;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminTorneos {

    private ArrayList<Torneo> ListaTorneo = new ArrayList();
    private File archivo = null;

    public AdminTorneos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Torneo> getListaTorneo() {
        return ListaTorneo;
    }

    public void setListaTorneo(ArrayList<Torneo> ListaTorneo) {
        this.ListaTorneo = ListaTorneo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        try {
            ListaTorneo = new ArrayList();
            Torneo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Torneo) objeto.readObject()) != null) {
                        ListaTorneo.add(temp);
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
            for (Torneo t : ListaTorneo) {
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
