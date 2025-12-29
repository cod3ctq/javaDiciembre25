public class EnvioInternacional extends Envio implements Rastreable{


    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public double mostrarDetalle() {
        return 0;
    }

    @Override
    public String obtenerEstado() {
        return "";
    }
}
