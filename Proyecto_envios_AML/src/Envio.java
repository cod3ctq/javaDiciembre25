public abstract class Envio {
    private String codigo;
    private double peso;
    private String destino;

    public Envio (){}

    public Envio(String codigo, String destino, double peso) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "codigo='" + codigo + '\'' +
                ", peso=" + peso +
                ", destino='" + destino + '\'' +
                '}';
    }
    public abstract double calcularCosto(double a,double b);
    public abstract String mostrarDetalle(String info);
}
