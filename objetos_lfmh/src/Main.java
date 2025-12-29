public class Main {
    public static void main(String[] args) {
        Ciudad cdmx = new Ciudad();
        cdmx.setLatitud(321.22);
        cdmx.setLogitud(333.22);
        cdmx.setNombre("Ciudad de México");
        cdmx.setPoblacion(8000000);
        cdmx.setNumColonias(100);

        System.out.println(cdmx.toString());



        Ciudad monterrey = new Ciudad(5000000,32,"Monterrey",30,500000);

        System.out.println(monterrey.toString());


    }

}
