//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EnvioNacional n1= new EnvioNacional("En1",10,"Acapulco","Centro");
        n1.asegurar();
        System.out.println(n1);

        EnvioInternacional n2 = new EnvioInternacional("Ei1",8.5,"Asia","Japon");
        System.out.println(n2);
        System.out.println("Estado:  " + n2.obtenerEstado());

        EnvioExpress n3 = new EnvioExpress("Ee1",3.5,"CDMX","alta");
        n3.asegurar();
        System.out.println(n3);
        System.out.println("Estado:  "+ n3.obtenerEstado());
    }
}