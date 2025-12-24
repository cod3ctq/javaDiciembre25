public class Asesoria {

    String cliente;
    String escolaridad;
    String grado;
    String asignatura;
    double precio;
    String asesor;
    String modalidad;
    boolean promocion;

    public Asesoria(){}

    public Asesoria(String cliente, String escolaridad, String grado, String asignatura, double precio, String asesor, String modalidad, boolean promocion) {
        this.cliente = cliente;
        this.escolaridad = escolaridad;
        this.grado = grado;
        this.asignatura = asignatura;
        this.precio = precio;
        this.asesor = asesor;
        this.modalidad = modalidad;
        this.promocion = promocion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAsesor() {
        return asesor;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    @Override
    public String toString() {
        return "Asesoria{" +
                "cliente='" + cliente + '\'' +
                ", escolaridad='" + escolaridad + '\'' +
                ", grado='" + grado + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", precio=" + precio +
                ", asesor='" + asesor + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", promocion=" + promocion +
                '}';
    }
}



