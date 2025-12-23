import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class conversor {
    public static void main(String[] args) {
         /*
12062008 --> doce de junio de 2008
23072010
26101990
12092001
13122015
18092025
19082009
         */

        String[] dias = {
                "uno", "dos", "tres", "cuatro", "cinco",
                "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince",
                "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco",
                "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
                "treinta y uno"
        };

        // Array con los nombres de los meses del año
        String[] meses = {
                "enero", "febrero", "marzo", "abril",
                "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre"
        };

        String ruta1 ="C:\\Users\\veron\\OneDrive\\Escritorio\\fechas.txt";
        String ruta2="C:\\Users\\veron\\OneDrive\\Escritorio\\escritura.txt";
        String linea;
        String fechaconvertida="";

        File lectura = new File(ruta1);
        File escritura = new File(ruta2);
        try {
            FileReader fr = new FileReader(lectura);
            FileWriter fw = new FileWriter(escritura);
            BufferedReader br = new BufferedReader(fr);

            int dia, mes, año;

            while ( (linea=br.readLine())!=null){
                System.out.println(linea);

                dia=Integer.parseInt(linea.substring(0,2));
                mes=Integer.parseInt(linea.substring(2,4));
                año=Integer.parseInt(linea.substring(4));

//                System.out.println("Dia: " + dia);
//                System.out.println("Mes: " + mes);

                System.out.println(dias[dia-1] + " de " + meses[mes-1] + " del " + año);
                fechaconvertida=dias[dia-1] + " de " + meses[mes-1] + " del " + año;
                fw.write(fechaconvertida + "\n");

            }
            fw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
