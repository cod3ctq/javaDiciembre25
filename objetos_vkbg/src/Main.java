import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //Crear un objeto de la clase
       // String texto = new String("");
        //Clase nombredevariable = new Constructor()
        Scanner teclado = new Scanner(System.in);
        Boleto b1 = new Boleto();
        b1.setNombre("Carlos");
        b1.setOrigen("Tlaxcala");
        b1.setDestino("Chihuahua");
        b1.setLinea("Omnibus de Mexico");
        b1.setPrecio(800.40);
        b1.setFechaHora("12/08/2009");
        System.out.println(b1);

        Boleto b2 = new Boleto("Ana", "29/03/2018", "Villahermosa", "CDMX", 1375.50, "ADO");
        System.out.println(b2);

        Credencial c1 = new Credencial();
        c1.setNombre("Esmeralda Ayer Cuevas");
        c1.setSemestre(1);
        c1.setCarrera("Licenciatura en informatica");
        c1.setFacultad("FCAeI");
        c1.setMatricula(10032948);
        c1.setVigencia("Agosto/25");
        System.out.println(c1);

        Credencial c2 = new Credencial("Lino Cruz Millan", 3, "Licenciatura en Administracion", "FCAeI", 10032954, "Enero/25");
        System.out.println(c2);

    }
}