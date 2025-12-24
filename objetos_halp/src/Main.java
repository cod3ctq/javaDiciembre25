public class Main{
    public static void main(String[] args) {

        //Si se venden 1000 boletos
        // Cada boleto se compone de:
        // Nombre, fecha, hora, destino, precio, linea

        // Crear un objeto de la clase

        //String texto = new String ("kuiuh");
        //Crear un boleto de la clase


        Boleto b1 = new Boleto();
        b1.setNombre("Carlos");
        b1.setOrigen("Tlaxcala");
        b1.setDestino("Chihuahua");
        b1.setLinea("Omnibus de Mexico");
        b1.setFechaHora("12/08/2009");
        b1.setPrecio(800.40);

        System.out.println(b1);

        Boleto b2 = new Boleto("Ana","29/03/2018","Villahermosa","CDMX",1370.50,"ADO");
        System.out.println(b2);



    }
}
