public class Main2 {
    public static void main(String[] args) {

        Asesoria x1 = new Asesoria();

        x1.setCliente("Emma Euan");
        x1.setEscolaridad("Secundaria");
        x1.setGrado("Segundo grado");
        x1.setAsignatura("Fisica");
        x1.setPrecio(75.00);
        x1.setAsesor("Hugo Lozano");
        x1.setModalidad("Presencial");
        x1.setPromocion(false);


        System.out.println(x1);

        Asesoria x2 = new Asesoria("Francisco Tepech","Primaria","Sexto Grado","Matematicas",100.00,"Angel Hernandez","Virtual",true);

        System.out.println(x2);



    }
}
