package examen2prograii_carlosnoé;

public class Partidos {
    public String Equipo1;
    public String Equipo2;
    public int PuntajeEquipo1;
    public int PuntajeEquipo2;

    public Partidos(String Equipo1, String Equipo2, int PuntajeEquipo1, int PuntajeEquipo2) {
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.PuntajeEquipo1 = PuntajeEquipo1;
        this.PuntajeEquipo2 = PuntajeEquipo2;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(String Equipo1) {
        this.Equipo1 = Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(String Equipo2) {
        this.Equipo2 = Equipo2;
    }

    public int getPuntajeEquipo1() {
        return PuntajeEquipo1;
    }

    public void setPuntajeEquipo1(int PuntajeEquipo1) {
        this.PuntajeEquipo1 = PuntajeEquipo1;
    }

    public int getPuntajeEquipo2() {
        return PuntajeEquipo2;
    }

    public void setPuntajeEquipo2(int PuntajeEquipo2) {
        this.PuntajeEquipo2 = PuntajeEquipo2;
    }
    
    
}
