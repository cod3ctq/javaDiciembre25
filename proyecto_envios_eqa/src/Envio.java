public abstract class Envio {

    String codigo;
    double peso;
    String destino;

    public Envio() {
    }

    public Envio(String codigo, double peso, String destino) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
    }

    public abstract double calcularCosto ();
    public abstract String mostrarDetalle ();
}
