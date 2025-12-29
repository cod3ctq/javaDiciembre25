public class EnvioNacional extends Envio {
String region;
double montoAsegurado;

    @Override
    public double calcularCosto() {
        return 0;
    }


    public String mostrarDetalle() {
        return "";
    }


    public double getMontoAsegurado() {
        return montoAsegurado;
    }

public void asegurar (){}



}
