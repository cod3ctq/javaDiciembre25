//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Clase abstracta: aquella que contiene al menos 1 metodos abstracto
        //Metodo abstracto: un metodo que no tiene cuerpo ni logica de implementacion

        //Es un modelo generico de algo... define una base conceptual incompleta
        //con 1 o mas metodos abstractos, aunque tambien puede tener miembros NO abstractos
        //No puedes crear instancias de ella

//        profesionista prof = new profesionista();

        //Polimorfismo:
        //Sobreescritura
        //Sobrecarga de metodos
        //Herencia:

       //ClaseAbstracta-----clase especifica
        profesionista c1= new Contador();
        profesionista c2 = new Chef();
        profesionista c3 = new Capitan();

        c1.trabajar();
        System.out.println("---------------");
        c2.trabajar();
        System.out.println("----------------");
        c3.trabajar();
        System.out.println("-----------------");

        Calculadora cc1= new Basica(); //Objeto de la clase hija
        System.out.println(cc1.suma(5,9));
        System.out.println(cc1.resta(7,2));
        System.out.println(cc1.multiplicacion(3,9));

Cientifica cc2 = new Cientifica(); //Objeto de la clase hija 2
        System.out.println(cc2.suma(3,20));
        System.out.println(cc2.resta(5,4));
        System.out.println(cc2.multiplicacion(8,5));
        System.out.println(cc2.raizaCuadrada(64));
        System.out.println(cc2.seno(80));
        System.out.println(cc2.potencia(4,8));
            }
        }

