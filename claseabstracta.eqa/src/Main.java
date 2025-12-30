//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Clase abstracta: aquella que contiene al menos 1 metodo abstracto
        //Metodo abstracto : un metodo que no tiene cuerpo ni logica de implementacion


Profesionista c1 = new Contador();


Calculadora cc1 = new Basica();

        System.out.println(cc1.suma(5,9));
        System.out.println(cc1.resta(7,2));
        System.out.println(cc1.multiplicacion(3,9));
Cientifica cc2 = new Cientifica();
        System.out.println(cc2.suma(10,15));
        System.out.println(cc2.resta(25,30));
        System.out.println(cc2.multiplicacion(20,30));
        System.out.println(cc2.raisCuadrada(40));
        System.out.println(cc2.seno(80));
        System.out.println(cc2.potencia(4,8));
    }
}
