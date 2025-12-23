import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Conversor {
    public static void main(String[] args) {

/*
        12062008---> Doce de junio dde 2008
        23072010--->
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

        String ruta1 = "C:\\Users\\Usuario 1\\Desktop\\fechas.txt";
        String ruta2 = "C:\\Users\\Usuario 1\\Desktop\\Escritura.txt";
        String linea;
        File lectura = new File(ruta1);
        File escritura = new File(ruta2);
        String fechaconvertida;
        try{
            FileReader fr = new FileReader(lectura);
            FileWriter fw = new FileWriter(escritura);
            BufferedReader br = new BufferedReader(fr);

            int dia, mes, año;

            while ((linea=br.readLine())!=null){
                System.out.println(linea);
                dia = Integer.parseInt(linea.substring(0,2));
                mes = Integer.parseInt(linea.substring(2,4));

                System.out.println("Dia: " + dia);
                System.out.println("Mes: " + mes);

                //System.out.println("Dia en texto es: " + dias[dia-1]);
                //System.out.println("Mes en texto: " + meses[mes-1]);
                //System.out.println("fecha: " + dias[dia-1]+" de " +meses[mes-1]+" de " +linea.substring(4));

                fechaconvertida="fecha: " + dias[dia-1]+" de " +meses[mes-1]+" de " +linea.substring(4);
                System.out.println(fechaconvertida);
                fw.write(fechaconvertida + "\n");

            }
            fw.close();
        }catch(Exception ex){

        }

    }
}
