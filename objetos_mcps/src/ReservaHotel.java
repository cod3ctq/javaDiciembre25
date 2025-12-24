public class ReservaHotel {

    String nombre;
    String ciudad;
    String Hotel;
    String fecha;
    double precio;

    public ReservaHotel() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ReservaHotel{" + "nombre='" + nombre + '\'' + ", ciudad='" + ciudad + '\'' + ", Hotel='" + Hotel + '\'' + ", fecha='" + fecha + '\'' + ", precio=" + precio + '}';
    }

    public ReservaHotel(String nombre, String ciudad, String hotel, String fecha, double precio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        Hotel = hotel;
        this.fecha = fecha;
        this.precio = precio;


    }
}
