void main() {
// si se venden 1000 boletos
// Cada boleto se compone de:
//datos
//crear un objeto de la clase
    String texto = new String("sdcsdcsd");
    //clase variable = new constructor(;
    Boleto b1 = new Boleto();
    b1.setNombre("Carlos");
    b1.setOrigen("Tlaxcala");
    b1.setDestino("Chihuahua");
    b1.setLinea("Omnibus de Mexico");
    b1.setPrecio(80.40);
    b1.setFechaHora("12/08/2009");
    System.out.println(b1);
    Boleto b2 = new Boleto("Carlos","12/06/2015","villahermosa","cdmx",1752.50,"ABD");
    System.out.println(b2);

    Ticket a1 = new Ticket();
    a1.setNombre("Alan");
    a1.setMarca("Adidas");
    a1.setProducto("Tenis airforce 1");
    a1.setTienda("Perisur");
    a1.setPrecio(2400.25);
    System.out.println(a1);
    Ticket a2 = new Ticket("Alan","Sudadera",1599.99,"Tezontle","Puma");
    System.out.println(a2);
}

