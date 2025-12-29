//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ClaseAbstracta ----- clase especifica
        Profesionista c1 = new Contador();
        Profesionista c2 = new Chef();
        Profesionista c3 = new Capitan();

        c1.trabajar();
        System.out.println("--------------");
        c2.trabajar();
        System.out.println("--------------");
        c3.trabajar();

        Calculadora cc1 = new Basica(); //Objeto de la clase hija 1
        System.out.println(cc1.suma(5,9));
        System.out.println(cc1.resta(7,2));
        System.out.println(cc1.multiplicacion(3,9));

        Cientifica cc2 = new Cientifica();//Objeto de la clase hija 2
        System.out.println(cc2.suma(3,20));
        System.out.println(cc2.resta(5,4));
        System.out.println(cc2.multiplicacion(8,5));
        System.out.println(cc2.raizCuadrada(40));
        System.out.println(cc2.seno(80));
        System.out.println(cc2.potencia(4,8));
    }
}