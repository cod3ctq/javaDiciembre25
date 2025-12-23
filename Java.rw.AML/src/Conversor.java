import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Conversor {
    void main(){
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
        String ruta1= "D:\\DOCUMENTOS\\Documents\\curso\\numeros.txt";
        String ruta2= "D:\\DOCUMENTOS\\Documents\\curso\\escritura.txt";
        String linea;
        String fechaconvertida;
        File lectura = new File(ruta1);
        File escritura = new File(ruta2);
        try {
            FileReader fr = new FileReader(lectura);
            FileWriter fw = new FileWriter(escritura);
            BufferedReader br = new BufferedReader(fr);
            int dia, mes;

            while ( (linea=br.readLine())!=null){
                System.out.println(linea);
                dia= Integer.parseInt(linea.substring(0,2));
                mes= Integer.parseInt(linea.substring(2,4));
                System.out.println("Dia: "+dia);
                System.out.println("Mes: "+mes);
                fechaconvertida="Fecha: "+dias[dia-1]+" de "+meses[mes-1]+" de "+linea.substring(4);
                fw.write(fechaconvertida+"\n");
            }fw.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
