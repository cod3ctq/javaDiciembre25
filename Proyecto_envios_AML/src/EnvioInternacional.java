public class EnvioInternacional extends Envio implements Rastreable{

    @Override
    public double calcularCosto(double a, double b) {
        return 0;
    }

    @Override
    public String mostrarDetalle(String info) {
        return "";
    }

    @Override
    public String obtenerEstado() {
        return "";
    }
}
