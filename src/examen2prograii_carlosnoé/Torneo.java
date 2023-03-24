package examen2prograii_carlosnoé;

import java.util.ArrayList;

public class Torneo {
public String Nombre;
public ArrayList<Equipos> Equipos;
public ArrayList<Partidos> Partidos;
public String PeriodoRZ;

    public Torneo(String Nombre, ArrayList<Equipos> Equipos, ArrayList<Partidos> Partidos, String PeriodoRZ) {
        this.Nombre = Nombre;
        this.Equipos = Equipos;
        this.Partidos = Partidos;
        this.PeriodoRZ = PeriodoRZ;
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

    public String getPeriodoRZ() {
        return PeriodoRZ;
    }

    public void setPeriodoRZ(String PeriodoRZ) {
        this.PeriodoRZ = PeriodoRZ;
    }


}
