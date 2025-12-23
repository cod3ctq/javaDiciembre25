import java.io.*;

public class Conversor {
    public static void main(String[] args) throws IOException {
        /*
12062008 ---> doce de junio de 2008
23072010 ---> veintitres de julii de 2010
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
        String ruta1 ="C:\\Users\\USUARIO1\\OneDrive\\Escritorio\\fechas1.txt";
        String ruta2 ="C:\\Users\\USUARIO1\\OneDrive\\Escritorio\\escritura.txt";
        String linea;
        File lectura = new File(ruta1);
        File escritura = new File(ruta2);
        String fechaConvertida;

        try{
            FileReader fr = new FileReader(lectura);
            FileWriter fw = new FileWriter(escritura);
            BufferedReader br = new BufferedReader(fr);

            int dia, mes, año;
            while ((linea=br.readLine())!=null){
                //transformar en texto
                System.out.println(linea);

                dia = Integer.parseInt(linea.substring(0,2));
                mes = Integer.parseInt(linea.substring(2,4));
                System.out.println("Dia: "+dia);
                System.out.println("Mes: "+mes);

                fechaConvertida = "Fecha: "+dias[dia-1]+ " de "+meses[mes-1]+" de "+linea.substring(4);
                System.out.println(fechaConvertida);
                fr.writer



            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
