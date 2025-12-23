import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Comversor {
    public static void main(String[] args) {


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

String ruta1= "\"C:\\Users\\gusta\\OneDrive\\Desktop\\Nuevo Documento de texto.txt\"";
String ruta2 ="\"C:\\Users\\gusta\\OneDrive\\Desktop\\Escritura.txt\"";
String liena ;
        File lectura = new File(ruta1);
        File escrtritura = new File(ruta2);
        try {
            FileReader fr = new FileReader(lectura);
            FileWriter fw = new FileWriter(escrtritura);
            BufferedReader br = new BufferedReader(fr);

            int dia, mes, año;



            while ((liena = br.readLine())!= null){
                System.out.println(liena);

                dia = Integer.parseInt(liena.substring(0,2));
                mes =Integer.parseInt(liena.substring(2,4));

                System.out.println("dia = "+ mes);
                System.out.println("mes:"+mes);




            }
        }catch(Exception ex){


            System.out.println(Exception.getMessesage());
        }

    }
}
