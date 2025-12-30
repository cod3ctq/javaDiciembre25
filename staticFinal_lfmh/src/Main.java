//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Modificadores de comportamiento

        //static : crea miembros de clase, con valores compartidos por todas
        // las instancias de dicha clase

        //final : crea miembros inmuntables (que no pueden cambiar)

        PlayStation play1 = new PlayStation("1", "Gris", 8);
        PlayStation play2 = new PlayStation("2","Blanco",40);
        PlayStation play3 = new PlayStation("3","Negro", 120);
        PlayStation play4 = new PlayStation("4","Gris",40);
        PlayStation play5 = new PlayStation("5","Blanco", 500);

        System.out.println();
        System.out.println();


        //Cambiar el valor de un miembro estático

        System.out.println(PlayStation.FABRICANTE);;



    }
}