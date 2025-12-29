public class Boleto {
    private String nombre;
    private String fechaHora;
    private String origen;
    private double precio;

    public Boleto() {
    }

    public Boleto(String fechaHora, String nombre, String origen, double precio) {
        this.fechaHora = fechaHora;
        this.nombre = nombre;
        this.origen = origen;
        this.precio = precio;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "fechaHora='" + fechaHora + '\'' +
                ", nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", precio=" + precio +
                '}';
    }
}
