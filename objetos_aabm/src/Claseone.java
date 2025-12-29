public class Claseone {

    String jefeMaestro;
    String cortana;
    String unoUnoSiete;
    String vannak;
    int identificacion;
    double codigo;


    public Claseone() {
    }

    public Claseone(String jefeMaestro, String cortana, String unoUnoSiete, String vannak, int identificacion, double codigo) {
        this.jefeMaestro = jefeMaestro;
        this.cortana = cortana;
        this.unoUnoSiete = unoUnoSiete;
        this.vannak = vannak;
        this.identificacion = identificacion;
        this.codigo = codigo;
    }

    public String getJefeMaestro() {
        return jefeMaestro;
    }

    public void setJefeMaestro(String jefeMaestro) {
        this.jefeMaestro = jefeMaestro;
    }

    public String getCortana() {
        return cortana;
    }

    public void setCortana(String cortana) {
        this.cortana = cortana;
    }

    public String getUnoUnoSiete() {
        return unoUnoSiete;
    }

    public void setUnoUnoSiete(String unoUnoSiete) {
        this.unoUnoSiete = unoUnoSiete;
    }

    public String getVannak() {
        return vannak;
    }

    public void setVannak(String vannak) {
        this.vannak = vannak;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Claseone{" +
                "jefeMaestro='" + jefeMaestro + '\'' +
                ", cortana='" + cortana + '\'' +
                ", unoUnoSiete='" + unoUnoSiete + '\'' +
                ", vannak='" + vannak + '\'' +
                ", identificacion=" + identificacion +
                ", codigo=" + codigo +
                '}';
    }
}
