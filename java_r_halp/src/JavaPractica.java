import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaPractica {
    public static void main(String[] args) {
        //lectura de archivos con Java

        String ruta = "C:\\Users\\hugol\\OneDrive\\Escritorio\\HALP.txt";
        String linea;

        File file = new File(ruta); //Representacion en memoria del archivo
        String ruta2 = "C:\\Users\\hugol\\OneDrive\\Escritorio\\escritura.txt";
        File escritura = new File(ruta2);
        try{
            FileReader fr = new FileReader (file);  //Cargar una copia del contenido en ram
            BufferedReader br = new BufferedReader (fr); //Leer ese caché
            while ( (linea = br.readLine()) !=null){
                System.out.println(linea);
            }
//
//    FileWriter fw = new FileWriter(escritura);
//    fw.write("UN TEXTO DE PRUEBA, DEBE SER VISIBLE DENTRO DEL ARCHIVO");
//    fw.write("Este es un nuevo texto de prueba");
//    fw.close(); //Guardar cambios dentro del archivo


        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }}
}