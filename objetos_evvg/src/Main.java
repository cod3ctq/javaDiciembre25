import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //si se venden 1000 boletos
        //Cada boleto contiene:
        //nombre, origen, destino, hora, precio, linea
        //Crear un nuevo tipo de dado/calse

        //Crear un objeto de la clase
//        Scanner teclado = new Scanner(System.in);
//
//        String texto= new String("holaaa");
//        Boleto b1 = new Boleto();//Objeto vacío
//        b1.setNombre("Carlos");
//        b1.setOrigen("Tlaxcala");
//        b1.setDestino("Chihuahua");
//        b1.setLinea("Omnibus Mexico");
//        b1.setPrecio(800.40);
//        b1.setFechaHora("12/08/2025");
//
//        System.out.println(b1);
//
//        Boleto b2 = new Boleto("Ana", "29/03/2018","Villahermosa","CDMX",1370.7,"ADO");
//        System.out.println(b2);

       //Crear una clase, modelando lo que quiera
        //Crear un objeto vacío, llenarlo con los setter, imprimir el objeto
        //Crear un objeto lleno/imprimir el objeto

        Orden o1 = new Orden();

        o1.setMesero("Paco");
        o1.setNumeroMesa("12");
        o1.setPlatillo("2 Enchiladas verdes");
        o1.setBebida("1L Horchata");
        o1.setPostre("Pastel chocolate");
        o1.setTotal(325.5);
        System.out.println(o1);

        Orden o2 = new Orden("Alejandra","18","2 Pozoles","2l Jamaica","2 gelatinas", 481.30);
        System.out.println(o2);



        }


    }
