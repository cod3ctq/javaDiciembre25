import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Conversor {
    public static void main(String[] args) {
              /*
        12062008
        23072010
        26101990
        12092001
        13122015
        18092025
        19082009
                */
        String ruta = "C:\\Users\\Usuario 1\\Desktop\\XXX.txt";
        String ruta2 = "C:\\Users\\Usuario 1\\Desktop\\Escritura.txt";
        String linea;
        File lectura = new File(ruta);
        String fechaConvertida;
        File escritura = new File(ruta2);
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

        try {
            FileReader fr = new FileReader(lectura);
            FileWriter fw = new FileWriter(escritura);
            BufferedReader br = new BufferedReader(fr);
            int dia, mes;
            while ((linea = br.readLine()) != null) {
                //Transformar texto
                System.out.println(linea);
                dia = Integer.parseInt(linea.substring(0, 1));
                mes = Integer.parseInt(linea.substring(2, 4));
                fechaConvertida = " Fecha " + dias[dia - 1] + " de " + meses[mes - 1] + " de " + linea.substring(4);
fw.write(fechaConvertida+"\n");

            }
            fw.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }


    }
}
