public class Credencial {

    String nombre;
    int semestre;
    String carrera;
    String facultad;
    int matricula;
    String vigencia;

    public Credencial(String nombre, int semestre, String carrera, String facultad, int matricula, String vigencia) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.carrera = carrera;
        this.facultad = facultad;
        this.matricula = matricula;
        this.vigencia = vigencia;
    }

    public Credencial (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "nombre='" + nombre + '\'' +
                ", semestre=" + semestre +
                ", carrera='" + carrera + '\'' +
                ", facultad='" + facultad + '\'' +
                ", matricula=" + matricula +
                ", vigencia='" + vigencia + '\'' +
                '}';
    }
}
