public class EnvioExpress extends Envio implements Rastreable, Asegurable{

    String prioridad;



    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public String mostrarDetalle() {
        return "";
    }

    @Override
    public void asegurar() {

    }

    @Override
    public double getMontoAsegurado() {
        return 0;
    }

    @Override
    public String obtenerEstado() {
        return "";
    }
}
