public abstract class calculadora {
    private String marca;
    private String modelo;


    public calculadora(){}

    public calculadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "calculadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public abstract double suma(double a, double b);
    public abstract double resta(double a, double b);
    public abstract double  multiplicacion (double a, double b);

}
