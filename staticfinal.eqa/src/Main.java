//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        PlayStation play1 = new PlayStation();
        PlayStation play2 = new PlayStation();
        PlayStation play3 = new PlayStation();
        PlayStation play4 = new PlayStation();


//        PlayStation.getFabricante();
//        PlayStation.getIconos();


        //cambiar el valor de un miembro estatico...

//        play1.setFabricante("Apple");

//Para reasignar un valor a una constante -> No se puede cuando ya se declaró como final
//El modificador static permite crear vaores globales, compartidos por todas las
        // instancias de una clase, el modificado final permite aplicar la inmutabilidad
        //define miembros que no cambian

        /*
        FINAL actua en 3 niveles:
        1- Atributo : Crea constantes
        2- Metodo : Impide la sobreescritura
        3- Clase : Impide la herencia
         */
    }
}