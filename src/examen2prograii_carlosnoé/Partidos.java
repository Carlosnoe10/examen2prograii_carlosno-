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
    
    
    
    /* 
    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private File archivo = null;
    
    public adminAlumno(String path) {
        archivo = new File(path);//String path
    }

    public ArrayList<Alumno> getListaPersonas() {
        return listaAlumnos;
    }

    public void setListaPersonas(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setAlumno(Alumno a){
        listaAlumnos.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaAlumnos = new ArrayList();
            Alumno temp;
            if (archivo.exists()) {
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto= new ObjectInputStream(entrada);
                try {
                    while ((temp = (Alumno) objeto.readObject()) != null) {
                        listaAlumnos.add(temp);
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

    public void escribirArchivo() { //Es escribir Alumno
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Alumno t : listaAlumnos) {
                bw.writeObject(t);
            }
            //
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
    */
}
