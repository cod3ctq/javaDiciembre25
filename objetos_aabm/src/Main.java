//Miembros por default
//Constructores

//Una clase es un modelo o plantilla de algo....
//Tipo de dato personalizado
//Que y como

public class Main {
    public static void main(String[] args) {

//si se venden 1000 boletos
//cada boleto se compone de:
//nombre, fecha_hora,origen, destino,precio, linea


            //crear un objeto de la clase
                //String texto = new String("Kuiuh");
            //Clase / nombredeVariable = new Constructor();
                Boleto b1 = new Boleto(); //objeto vacio

                b1.setNombre("Carlos");
                b1.setOrigen("Tlaxcala");
                b1.setDestino("Chihuahua");
                b1.setLinea("Omnibus de Mexico");
                b1.setPrecio(800.40);
                b1.setFechaHora("12/08/2009");

                System.out.println(b1);

                Boleto b2 = new Boleto("Ana", "29/12/2025","villahermosa","cdmx", 1350.4, "ADO");
        System.out.println(b2);
        }


}