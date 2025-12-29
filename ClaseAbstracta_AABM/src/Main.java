public class Main {
    public static void main(String[] args) {

        //Clase abstracta: aquella que contiene al menos 1 metodo abstracto
        //Metodo abstracto: un metodo que no tiene cuerpo ni logica de implementacion



        //Es  un modelo generico de algo... define una base conceptual imcompleta
        //con 1 o mas metodos abstractos, aunque tambien puede tener miembros NO abstractos
        //No puedes crear instancias de ella

        //Profesionista prof = new Profesionista();

        //Polimorfismo:
        //Sobreescritura
        //Sobrecarga de metodos
        //Herencia:




        //Clase abstracta---Clase especifica
            Profesionista c1 = new Contador();
            Profesionista c2 = new Chef();
            Profesionista c3 = new Capitan();

            c1.trabajar();
        System.out.println("-------------------------------");
            c2.trabajar();
        System.out.println("-------------------------------");
            c3.trabajar();

            calculadora cc1 = new Basica(); //objeto de la clase hija1
        System.out.println(cc1.suma(5,9));
        System.out.println(cc1.resta(7,2));
        System.out.println(cc1.multiplicacion(3,9));

        Cientifica cc2 = new Cientifica(); //objeto de la clase hija2
        System.out.println(cc2.suma(3,20));
        System.out.println(cc2.resta(5,4));
        System.out.println(cc2.multiplicacion(8,5));
        System.out.println(cc2.raizCuadrada(40));
        System.out.println(cc2.seno(80));
        System.out.println(cc2.potencia(4,8));

    }
}