public abstract class Profesionista {

    private String nombre;
    private int edad;
    private String carrera;
    private String cedulaProf;


    public Profesionista() {
    }

    public Profesionista(String nombre, int edad, String carrera, String cedulaProf) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.cedulaProf = cedulaProf;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Profesionista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", cedulaProf='" + cedulaProf + '\'' +
                '}';
    }


    //  Cualquier profesionista deberia poder hacer

    public abstract void trabajar();
















}
