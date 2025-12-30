public class PlayStation {

    //Son atributos de instancia:
    //Cada objeto creado a partir de esta clase puede darles
    //valores diferentes a cada uno de ellos

    private String modelo;
    private String color;
    private double almacenamiento;


    //Atributos de clase:
    //Los valores de estos atributos ya fueron definidos
    //desde la clase y serán compartidos por todas las instancias de la misma
    //Al combinarse con final, se vuelve una constante
    public static final String FABRICANTE="SONY";
    public static String ICONOS="[]X0A";

    public PlayStation(){}

    public PlayStation(String modelo, String color, double almacenamiento) {
        this.modelo = modelo;
        this.color = color;
        this.almacenamiento = almacenamiento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }




   @Override
    public String toString() {
        return "PlayStation{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", fabricante=" + FABRICANTE +
                '}';
    }
}
