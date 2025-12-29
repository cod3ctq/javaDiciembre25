public class Boleto {
    //si se venden 1000 boletos
    //Cada boleto contiene:
    //nombre, origen, destino, hora, precio, linea
    //Crear un nuevo tipo de dado/calse

    String nombre;
    String fechaHora;
    String origen;
    String destino;
    double precio;
    String linea;

    public Boleto(){}//Vacío

    public Boleto(String nombre, String fechaHora, String origen, String destino, double precio, String linea) {
        this.nombre = nombre;
        this.fechaHora = fechaHora;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.linea = linea;
    }
    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "nombre='" + nombre + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", linea='" + linea + '\'' +
                '}';
    }

    /*
    Herencia
    Encapsulamiento
    Abstraccion
    Polimorfismo
     */



}
