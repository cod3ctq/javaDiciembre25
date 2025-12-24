//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Si se venden 1000 boletos...
// Cada boleto se compone de ;
//Nombre, fecha, hora, origen,destino, precio,linea

//Crear un objeto de la clase
        //String texto= new String("kuiuh")
        //Clase nombre variable= new Constructor();
//        Boleto b1= new Boleto();//objeto vacio
//b1.setNombre("Carlos");
//b1.setOrigen("Tlaxcala");
//b1.setDestino("Chihuahua");
//b1.setLinea("Omnibus de Mexico");
//b1.setPrecio(800.40);
//b1.setFechaHora("12/08/2009");
//        System.out.println(b1);
//
//        Boleto b2 = new Boleto("Ana", "29/03/2018","Villahermosa","CDMX",1370.50,"Omnibus");
//        System.out.println(b2);
//
        //Crear una clase, modelando lo que quiera
        //Crear un objeto vacio, llenarlo con los setter, imprimir el objeto
        //Crear un objeto lleno, imprimir el objeto

ReservaHotel a1= new ReservaHotel();
a1.setNombre("Moises");
a1.setCiudad("Acapulco");
a1.setHotel("Las Brisas");
a1.setFecha("31/12/2025");
a1.setPrecio(2340.50);
        System.out.println(a1);

        ReservaHotel a2 =new ReservaHotel("Dulce","Cuernavaca","Hotel One","18/02/2026",1500);
        System.out.println(a2);
    }
}
