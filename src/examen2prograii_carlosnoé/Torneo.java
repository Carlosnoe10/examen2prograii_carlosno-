package examen2prograii_carlosnoé;

import java.util.ArrayList;

public class Torneo {
public String Nombre;
public ArrayList<Equipos> Equipos;
public ArrayList<Partidos> Partidos;

    public Torneo(String Nombre, ArrayList<Equipos> Equipos, ArrayList<Partidos> Partidos) {
        this.Nombre = Nombre;
        this.Equipos = Equipos;
        this.Partidos = Partidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Equipos> getEquipos() {
        return Equipos;
    }

    public void setEquipos(ArrayList<Equipos> Equipos) {
        this.Equipos = Equipos;
    }

    public ArrayList<Partidos> getPartidos() {
        return Partidos;
    }

    public void setPartidos(ArrayList<Partidos> Partidos) {
        this.Partidos = Partidos;
    }


}
