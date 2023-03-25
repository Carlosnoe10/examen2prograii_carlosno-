package examen2prograii_carlosnoé;

import java.util.ArrayList;

public class Deporte {
    public String Nombre;
    public ArrayList <Torneo> QQDP;

    public Deporte(ArrayList<Torneo> QQDP, String Nombre) {
        this.QQDP = QQDP;
        this.Nombre=Nombre;
    }

    public ArrayList<Torneo> getQQDP() {
        return QQDP;
    }

    public void setQQDP(ArrayList<Torneo> QQDP) {
        this.QQDP = QQDP;
    }  

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
