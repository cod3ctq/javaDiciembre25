public abstract class Envio {

    private String codigo;
    private double peso;
    private String destino;

    public Envio(String codigo, double peso, String destino) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public abstract double calcularCosto();

    public abstract double getMontoAsegurado();

    @Override
    public String toString() {
        return "Envio{" +
                "codigo='" + codigo + '\'' +
                ", peso=" + peso +
                ", destino='" + destino + '\'' +
                '}';
    }

    public abstract void aseguras();
}

