public class EnvioNacional extends Envio implements Asegurable {

    String region;
    double montoAsg;

    public EnvioNacional (){}

    public EnvioNacional(String region, double montoAsg) {
        this.region = region;
        this.montoAsg = montoAsg;
    }

    public EnvioNacional(String codigo, double peso, String destino, String region, double montoAsg) {
        super(codigo, peso, destino);
        this.region = region;
        this.montoAsg = montoAsg;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getMontoAsg() {
        return montoAsg;
    }

    public void setMontoAsg(double montoAsg) {
        this.montoAsg = montoAsg;
    }

    @Override
    public String toString() {
        return "EnvioNacional{" +
                "region='" + region + '\'' +
                ", montoAsg=" + montoAsg +
                ", codigo='" + codigo + '\'' +
                ", peso=" + peso +
                ", destino='" + destino + '\'' +
                "} " + super.toString();
    }

    @Override
    public void asegurar() {
        System.out.println("Envio asegurado por $"+montoAsg);

    }

    @Override
    public double getMontoAsegurado() {
        return montoAsg;
    }

    @Override
    public double calcularCosto() {
        return peso * 10 + montoAsg * 0.05;
    }

    @Override
    public void mostrarDetalle() {
       System.out.println("Envio Nacional a "+destino+"en la región "+region);
    }
}

