public class EnvioExpress extends Envio implements Rastreable{

    String prioridad;

    public EnvioExpress (){}

    public EnvioExpress(String prioridad) {
        this.prioridad = prioridad;
    }

    public EnvioExpress(String codigo, double peso, String destino, String prioridad) {
        super(codigo, peso, destino);
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "EnvioExpress{" +
                "prioridad='" + prioridad + '\'' +
                ", codigo='" + codigo + '\'' +
                ", peso=" + peso +
                ", destino='" + destino + '\'' +
                "} " + super.toString();

    }

    @Override
    public double calcularCosto() {
        double factor;
        if (prioridad.equalsIgnoreCase("Alta")){
            factor = 50;
        } else {
            factor = 30;
        } return peso * factor;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("En transito Express");
    }

    @Override
    public String obtenerEstado() {
        return "En transito Express";
    }
}
