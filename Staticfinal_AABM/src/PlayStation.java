public class PlayStation {

    //son atributos de instancia :
    //cada objeto creado a partir de esta clase
    //puede darles valores deferentes a cada uno de ellos

    private String modelo;
    private String color;
    private double almacenamiento;


    //Atributos de clase: los valores de estos atributos
    //ya fueron definidos desde la clase y seran compartidos
    //por todas las instancias  de la misma
    //Al combinarse con final, se crea una constaante
    public static final String FABRICANTE = "SONY";
    public static final String iconos="[]XOA";



    public PlayStation(){};

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

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        PlayStation.fabricante = fabricante;
    }



    @Override
    public String toString() {
        return "PlayStation{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", fabricante=" + FABRICANTE
                +            '}';

    }
}
