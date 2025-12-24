public class Orden {
    //Orden de un restaurante
    //Cada orden incluye:
    //Mesero, numero de mesa, platillo, bebida, postre, total

    String mesero;
    String numeroMesa;
    String platillo;
    String bebida;
    String postre;
    double total;

    public Orden (){}

    public Orden(String mesero, String numeroMesa, String platillo, String bebida, String postre, double total) {
        this.mesero = mesero;
        this.numeroMesa = numeroMesa;
        this.platillo = platillo;
        this.bebida = bebida;
        this.postre = postre;
        this.total = total;
    }
    //Getter y setter

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     //toString


    @Override
    public String toString() {
        return "Orden{" +
                "mesero='" + mesero + '\'' +
                ", numeroMesa='" + numeroMesa + '\'' +
                ", platillo='" + platillo + '\'' +
                ", bebida='" + bebida + '\'' +
                ", postre='" + postre + '\'' +
                ", total=" + total +
                '}';
    }
}
