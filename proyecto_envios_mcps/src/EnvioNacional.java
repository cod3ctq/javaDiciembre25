public class EnvioNacional extends Envio implements Asegurable {

    private String region;
    private double montoAsegurado;

    public EnvioNacional(String codigo, double peso, String destino, String region) {
        super(codigo, peso, destino);
        this.region = region;
    }

    @Override
    public double calcularCosto() {
        return getPeso() * 10;
    }

    @Override
    public void asegurar() {
        montoAsegurado = 1000;
    }

    @Override
    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Region=" + region +
                ", MontoAsegurado=" + montoAsegurado;
    }

    @Override
    public void aseguras() {

    }

    @Override
    public double getMontoasegurado() {
        return 0;
    }
}
