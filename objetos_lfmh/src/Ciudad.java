public class Ciudad {
    private int poblacion;
    private int numColonias;
    private double latitud;
    private double logitud;
    private String Nombre;

    public Ciudad() {
    }

    public Ciudad(double latitud, double logitud, String nombre, int numColonias, int poblacion) {
        this.latitud = latitud;
        this.logitud = logitud;
        Nombre = nombre;
        this.numColonias = numColonias;
        this.poblacion = poblacion;
    }

    public int getNumColonias() {
        return numColonias;
    }

    public void setNumColonias(int numColonias) {
        this.numColonias = numColonias;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLogitud() {
        return logitud;
    }

    public void setLogitud(double logitud) {
        this.logitud = logitud;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "latitud=" + latitud +
                ", poblacion=" + poblacion +
                ", numColonias=" + numColonias +
                ", logitud=" + logitud +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}
