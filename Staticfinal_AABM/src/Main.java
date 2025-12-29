public class Main {
    public static void main(String[] args) {

        //modificadores de comportamiento
        //static: crea miembros de clase, con valores compartidos por todas
        //las instancias de dicha clase

        //final: crea miembros inmutables(que no pueden cambiar)

        PlayStation play1 = new PlayStation("1","gris",8);
        PlayStation play2 = new PlayStation("2","blanco",40);
        PlayStation play3 = new PlayStation("3","negro",120);
        PlayStation play4 = new PlayStation("4","plata",512);
        PlayStation play5 = new PlayStation("5","blanco",2);

            //no importa
        System.out.println(play1.getFabricante());
        System.out.println(play2.getFabricante());
        System.out.println(play3.getFabricante());
        System.out.println(play4.getFabricante());
        System.out.println(play5.getFabricante());

        System.out.println(play1.getIconos());
        System.out.println(play2.getIconos());
        System.out.println(play3.getIconos());
        System.out.println(play4.getIconos());
        System.out.println(play5.getIconos());


        //Forma correcta de acceder a un miembro estatico de una clase
        //No es necesario instanciar un objeto, puede acceder a un miembro estatico
        //de la clase con solo llamar a la clase misma

        PlayStation.getFabricante();
        PlayStation.getIconos();

        PlayStation.getFabricante();
        PlayStation.getIconos();



        //cambiar el valor de un miembro estatico...

        //play1.setFabricante("Apple");
        System.out.println(PlayStation.FABRICANTE);

       // System.out.println(play1);
       // System.out.println(play2);
        //System.out.println(play3);

            //reasignar un valor a una variable
            //No es posible cuando se le asigno un valor final
            PlayStation.FABRICANTE="Apple";

            //El modificador static permite crear valores globales, compartidos por
            //todas las instancias de una clase.
            //a su vez, el modificador final permite aplicar la inmutabilidad
            //define miembros que no cambian.

        /*
        Final actua en 3 niveles
            1.- Atributo: crea constantes
            2.- Metodo: impide la sobreescritura
            3.- Clase: impide la herencia
         */



    }



    }
