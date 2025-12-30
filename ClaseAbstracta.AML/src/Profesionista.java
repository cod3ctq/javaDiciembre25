public abstract class Profesionista {
    private String nombre;
    private int edad;
    private String carrera;
    private String cedulaProf;

    public Profesionista(){}

    public Profesionista(String carrera, String cedulaProf, int edad, String nombre) {
        this.carrera = carrera;
        this.cedulaProf = cedulaProf;
        this.edad = edad;
        this.nombre = nombre;
    }
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCedulaProf() {
        return cedulaProf;
    }

    public void setCedulaProf(String cedulaProf) {
        this.cedulaProf = cedulaProf;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Profesionista{" +
                "carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cedulaProf='" + cedulaProf + '\'' +
                '}';
    }
    //metodo abstracto sin cuerpo ni logica indica el que debes hacer pero no como
    public abstract void trabajar();

}
