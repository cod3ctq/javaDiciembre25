public class EnvioExpress extends Envio implements Rastreable, Asegurable{

    @Override
    public void asegurar() {

    }

    @Override
    public double getMontoAsegurado() {
        return 0;
    }

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
