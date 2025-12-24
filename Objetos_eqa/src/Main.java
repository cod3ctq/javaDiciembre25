//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//Crear un objeto de la clase
//Sintaxis para crear objetos
        //-> Clase nombredevariable = new Constructor();

//        Boleto b1 = new Boleto();
////Mecanismo para asignarle un valor
//        b1.setNombre("Carlos");


//Crear una clase modelando lo que queramos
        //Crear un objeto vacio y llenarlo con los setters
        //Imprimir el objeto
        /*Crear un objeto lleno, imprimir un objeto
    }*/
       Paciente p1 = new Paciente();
       p1.setNombre("Eduardo Perez Rodriguez");
       p1.setEdad(56);
       p1.setEstatura(1.85f);
       p1.setPeso(78);
       p1.setMotivoDeConsulta("Esguince de tobillo");
        System.out.println(p1);

        Paciente p2 = new Paciente("José perez munguia",78,"lumbalgia",75,1.70f);
        System.out.println(p2);
}
}
