//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //static: crea miembros de clase, con valores compartidos por todas
        //las instancias de dicha clase

        //final: crea miembros inmutables (que no pueden cambiar)

        Playstation play1= new Playstation("1","Gris",8 );
        Playstation play2= new Playstation("2","Blanco",40 );
        Playstation play3= new Playstation("3","Negro",120 );
        Playstation play4= new Playstation("4","Plata",500 );
        Playstation play5= new Playstation("5","Blanco",1000);


        //No importa cuantos objetos se hagan de la clase, todos ellos comparten
//        //los mismos valores en los miembros estaticos.
//        System.out.println(play1.fabricante);
//        System.out.println(play2.fabricante);
//        System.out.println(play3.fabricante);
//        System.out.println(play4.fabricante);
//        System.out.println(play5.fabricante);
//        System.out.println(play1.iconos);
//        System.out.println(play2.iconos);
//        System.out.println(play3.iconos);
//        System.out.println(play4.iconos);
//        System.out.println(play5.iconos);
//
////Forma correcta de acceder a un miembro estatico de una clase
//        //No es necesario instanciar un objeto, puedes acceder a un miembro estatico
//        //de la clase con solo llamar a la clase misma
//        Playstation.getFabricante();
//        Playstation.getIconos();
//
//        Integer.parseInt("45");
//
////Cambiar el valor de un miembro estatico....
//
//
//        Playstation.setFabricante("Apple");

        System.out.println(Playstation.FABRICANTE);

        //Reasignar un valor a una constante...
        //No es posible cuando ya se ha declarado como final
        Playstation.FABRICANTE= "Apple";

        //El modificador static permite crear valores globales, compartidos por
        //todas las instancias de una clase.
        //A su vez, el modificador final permite aplicar la inmutabilidad
        //define miembros que no cambian.

        /*
        FINAL actua en 3 niveles:
        1- Atributo: crea constantes
        2.- Metodo : impide la sobreescritura
        3 - Clase: Impide la herencia
         */


    }
}