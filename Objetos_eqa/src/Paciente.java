public class Paciente {

    String nombre;
    int edad;
    String motivoDeConsulta;
    int peso;
    float estatura;

   public Paciente (){};

    public Paciente(String nombre, int edad, String motivoDeConsulta, int peso, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivoDeConsulta = motivoDeConsulta;
        this.peso = peso;
        this.estatura = estatura;
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

    public String getMotivoDeConsulta() {
        return motivoDeConsulta;
    }

    public void setMotivoDeConsulta(String motivoDeConsulta) {
        this.motivoDeConsulta = motivoDeConsulta;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", motivoDeConsulta='" + motivoDeConsulta + '\'' +
                ", peso=" + peso +
                ", estatura=" + estatura +
                '}';
    }
}
