public class EnvioInternacional extends Envio implements Rastreable {

    String paisDestino;

    public EnvioInternacional (){}

    public EnvioInternacional(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public EnvioInternacional(String codigo, double peso, String destino, String paisDestino) {
        super(codigo, peso, destino);
        this.paisDestino = paisDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    @Override
    public String toString() {
        return "EnvioInternacional{" +
                "paisDestino='" + paisDestino + '\'' +
                ", codigo='" + codigo + '\'' +
                ", peso=" + peso +
                ", destino='" + destino + '\'' +
                "} " + super.toString();
    }

    @Override
    public double calcularCosto() {
        return peso * 20 + 50;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Envio Internacional a "+paisDestino);
    }

    @Override
    public String obtenerEstado() {
        return "En transito nacional";
    }
}
