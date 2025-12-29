//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //static: Crea miembros de clase, con valores compartidos
        //por todas las instancias de dicha clase
        //final: crea miembros inmutables (que no pueden cambiar)

        PlayStation play1=new PlayStation("1","Gris",8);
        PlayStation play2=new PlayStation("2","Blanco",64);
        PlayStation play3=new PlayStation("3","Negro",120);
        PlayStation play4=new PlayStation("4","Plata",560);
        PlayStation play5=new PlayStation("5","Blanco",1000);

        //No importa cuantos objetos se hagan de la clase
//        //todos comparten los mismo valores en los miembros estáticos
//        System.out.println(play1.getFabricante());
//        System.out.println(play2.getFabricante());
//        System.out.println(play3.getFabricante());
//        System.out.println(play4.getFabricante());
//        System.out.println(play5.getFabricante());

        //La forma correcta de acceder a un miembro estatuico de una clase
        //No es necesario instanciar un objeto, puedes acceder a un miembro
        //estatico de la clase con solo llamar a la misma clase
//
//        PlayStation.getFabricante();
//        PlayStation.getIconos();


//        //Cambiar el valor de un miembro estatico
//          no es posible cuando ya se ha utilizado "final"
        //El modificador static permite crear valores globales, compartidos por
        //Todas las instancias de una clase.
        //A su vez, el modificador final permite aplicar la inmutabilidad
        //define miembros que no cambian.

        //Final actua en 3 niveles
        /*
        1)Atributo: define constantes
        2)Método: impide la sobreescritura(El override en herencia)
        3)Clase: impide la herencia
         */

        System.out.println(PlayStation.FABRICANTE);






        }
    }
