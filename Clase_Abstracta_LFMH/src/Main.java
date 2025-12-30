import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Clase abstracta es aquella que contiene al menos un metodo abstracto
        //Metodo abstracto : un metodo que no tiene cuerpo ni implementacion

        //Clase abstracta --- clase Profesionista

        //Polimorfismo
        //Sobreestructura
        //Sobrecarga de metodos
        //Herencia de métodos
        //Herencia :

        Profesionista c1 = new Contador();
        Profesionista c2 = new Chef();
        Profesionista c3 = new Capitan();

        c1.trabajar();
        System.out.println("------------------------------------------------------------");
        c2.trabajar();
        System.out.println("------------------------------------------------------------");
        c3.trabajar();

        Calculadora cImplementada = new Cientifica();//Objeto de la clase hija
        System.out.println(cImplementada.suma(5,6));
        System.out.println(cImplementada.resta(5,2));
        System.out.println(cImplementada.multiplicacion(8,2));

        Cientifica cc2 = new Cientifica();
        System.out.println(cc2.suma(3,2));
        System.out.println(cc2.resta(6,12));
        System.out.println(cc2.multiplicacion(34,6));
        System.out.println(cc2.raizCuadrada(9));
    }
}