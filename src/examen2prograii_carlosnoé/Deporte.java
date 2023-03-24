package examen2prograii_carlosnoé;

import java.util.ArrayList;

public class Deporte {
    public ArrayList <Torneo> QQDP;
    public String PeriodoRZ;

    public Deporte(ArrayList<Torneo> QQDP, String PeriodoRZ) {
        this.QQDP = QQDP;
        this.PeriodoRZ = PeriodoRZ;
        
    }
    public ArrayList<Torneo> getQQDP() {
        return QQDP;
    }

    public void setQQDP(ArrayList<Torneo> QQDP) {
        this.QQDP = QQDP;
    }

    public String getPeriodoRZ() {
        return PeriodoRZ;
    }

    public void setPeriodoRZ(String PeriodoRZ) {
        this.PeriodoRZ = PeriodoRZ;
    }
    
    
}
