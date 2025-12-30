//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Aquella que contienen al menos un metodo abstracto
        //Metodo abstracto: un metodo que no tiene cuerpo ni logica de implementacion
        //Es un modelo generico de algo...define una base conceptual incompleta
        //con uno o mas metodos abstractos, aunque también puede tener
        //metodos no abstractos

        //Clase abstracta -----> Clase especifica

        Profesionista c1 = new Contador();
        Profesionista c2 = new Chef();
        Profesionista c3 = new Capitan();

        c1.trabajar();
        System.out.println("-----------------");
        c2.trabajar();
        System.out.println("_________________");
        c3.trabajar();
        System.out.println("_______________");

        Calculadora cal1=new Basica();//Objeto de la calse hija1
        System.out.println(cal1.suma(5,9));
        System.out.println(cal1.resta(12,5));
        System.out.println(cal1.multiplicacion(12,3));

        Cientifica cal2=new Cientifica();//Objeto clase hija2
        System.out.println(cal2.suma(23,9));
        System.out.println(cal2.resta(122,5));
        System.out.println(cal2.multiplicacion(12,5));
        System.out.println(cal2.raizCuadrada(144));
        System.out.println(cal2.seno(90));
        System.out.println(cal2.potencia(4,8));










        }
    }
