//Una clase es un modelo o plantilla de algo
//Un tipo de dato personalizado
//Una clase es un conjunto de "qué" compone a un objeto y "cómo" deberia comportarse ese objeto
//Se debe usar el camelCase -> la primer letra de la primer palabra es minuscula y la primer letra de la
//segunda palabra debe ser mayuscula y asi las demás primeras letras de las siguientes palabras
public class Boleto {

    String nombre;
    String fechayHora;
    String origen;
    String destino;
    String linea;
    double precio;

//Miembros por default

    //Métodos constructores  -> //Siempre llevan el nombre de la clase

    public Boleto() {} //Constructor vacío, este se hace primero
    //Constructores
    public Boleto(String fechayHora, String nombre, String destino, String origen, String linea, double precio) {
        this.fechayHora = fechayHora;
        this.nombre = nombre;
        this.destino = destino;
        this.origen = origen;
        this.linea = linea;
        this.precio = precio;
    }
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
                           //Argumento es el valor que necesita recibir el metodo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(String fechayHora) {
        this.fechayHora = fechayHora;
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

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Boleto{" +
                "nombre='" + nombre + '\'' +
                ", fechayHora='" + fechayHora + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", linea='" + linea + '\'' +
                ", precio=" + precio +
                '}';
    }

    /* Pilares de la orientacion a objetos
    Herencia
    Encapsilamiento
    Abstraccion
    Polimorfismo
     */



}
