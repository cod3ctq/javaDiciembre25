public class EnvioExpress extends Envio implements Rasteable, Asegurable {

    private String prioridad;
    private double montoAsegurado;

    public EnvioExpress(String codigo, double peso, String destino, String prioridad) {
        super(codigo, peso, destino);
        this.prioridad = prioridad;
    }

    @Override
    public double calcularCosto() {
        return getPeso() * 30;
    }

    @Override
    public String obtenerEstado() {
        return "Entrega rápida";
    }

    @Override
    public void asegurar() {
        montoAsegurado = 2000;
    }

    @Override
    public double getMontoasegurado() {
        return 0;
    }

    @Override
    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Prioridad=" + prioridad +
                ", MontoAsegurado=" + montoAsegurado;
    }

    @Override
    public void aseguras() {

    }
}

