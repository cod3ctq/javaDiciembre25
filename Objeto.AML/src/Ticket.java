public class Ticket {
    String nombre;
    String producto;
    double precio;
    String tienda;
    String marca;

    public Ticket(){}
    public Ticket(String nombre, String producto, double precio, String tienda, String marca) {
        this.nombre = nombre;
        this.producto = producto;
        this.precio = precio;
        this.tienda = tienda;
        this.marca = marca;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "nombre='" + nombre + '\'' +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                ", tienda='" + tienda + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
