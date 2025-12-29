public class EnvioInternacional extends Envio implements Rasteable {

    private String paisDestino;

    public EnvioInternacional(String codigo, double peso, String destino, String paisDestino) {
        super(codigo, peso, destino);
        this.paisDestino = paisDestino;
    }

    @Override
    public double calcularCosto() {
        return getPeso() * 20;
    }

    @Override
    public double getMontoAsegurado() {
        return 0;
    }

    @Override
    public String obtenerEstado() {
        return "En tránsito";
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", PaisDestino=" + paisDestino;
    }

    @Override
    public void aseguras() {

    }
}