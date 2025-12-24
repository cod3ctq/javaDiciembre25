public class ClaseMaestra {


    public static void main(String[] args) {
        Claseone  c1 = new Claseone();   //Objeto vacio

                c1.setCodigo(117);
                c1.setCortana("IA");
                c1.setVannak("Destructor");
                c1.setJefeMaestro("MasterChief");
                c1.setIdentificacion(044);
                c1.setUnoUnoSiete("superSoldado");

                    System.out.println(c1);

                    Claseone c2 = new Claseone("John-117", "Reach", "Fantasma", "Soldado", 111, 125);
                    System.out.println(c2);
    }
}
