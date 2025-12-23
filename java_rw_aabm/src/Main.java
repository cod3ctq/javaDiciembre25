import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        //Lectura de archivo con java
        String linea;
        String ruta = "C:\\Users\\Usuario 1\\Desktop\\Ejemplo 1.txt";
        String ruta2="C:\\Users\\Usuario 1\\Desktop\\Escritura.txt";
        File file = new File(ruta);

        File escritura = new File(ruta2);

        try {
            //FileReader fr = new FileReader(file);
            //BufferedReader br = new BufferedReader(fr);
            //while ((linea = br.readLine()) != null) {
              //  System.out.println(linea);
            //}
            FileWriter fw = new FileWriter(escritura);
            fw.write("UN TEXTO DE PRUEBA, DEBE SER VISIBLE DENTRO DEL ARCHIVO");
            fw.write(" HOLA");
            fw.close();//guardar los cambios dentro del archivo
        }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }