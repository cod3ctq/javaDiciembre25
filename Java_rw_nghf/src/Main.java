import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Lectura de archivo con Java
        String ruta ="C:\\Users\\USUARIO1\\OneDrive\\Escritorio\\ejercicio.txt\"";
        String linea;
        File file = new File(ruta); //Representación en memoria del archivo
        File escritura;

        try {
            FileReader fr = new FileReader(file); //Cargar una copia del contenido en rama
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine())!= null) {
                System.out.println(linea);
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
            }

    }
}
