//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PlayStation play1= new PlayStation("1", "Gris", 8);
        PlayStation play2= new PlayStation("2", "Blanco", 40);
        PlayStation play3= new PlayStation("3", "Negro", 120);
        PlayStation play4= new PlayStation("4", "Plata", 500);
        PlayStation play5= new PlayStation("5", "Blanco", 1);

        //No importa cuantos objetos de hagan de la clase, todos ellos
        //comparten los mismos valores en los miembros estaticos
//        System.out.println(play1.getFabricante());
//        System.out.println(play2.getFabricante());
//        System.out.println(play3.getFabricante());
//        System.out.println(play4.getFabricante());
//        System.out.println(play5.getFabricante());
//
//        System.out.println(play1.getIconos());
//        System.out.println(play2.getIconos());
//        System.out.println(play3.getIconos());
//        System.out.println(play4.getIconos());
//        System.out.println(play5.getIconos());

        //Forma correcta de acceder a un miembro estatico de una clase
        //No es necesario instanciar un objeto, puedes accedera un miembro estatico
        //de la clase con solo llamar a la clase misma
//        PlayStation.getFabricante();
//        PlayStation.getIconos();

        //Cambiar el valor de un miembro estatico
        //play1.setFabricante("Apple");
       // System.out.println(play1);
       // System.out.println(play2);

        System.out.println(PlayStation.FABRICANTE);

        //Reasignar un valor a una constante...
        //No es posible cuando ya se ha declarado como final
        //PlayStation.FABRICANTE = "Apple";
    }
}