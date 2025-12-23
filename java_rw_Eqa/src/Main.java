import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
String ruta = "C:\\Users\\Usuario 1\\Desktop\\EQA.txt";
String linea;

File file = new File(ruta); //Representacion en memoria del archivo
        String ruta2 = "C:\\Users\\Usuario 1\\Desktop\\Escritura.txt";
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
}
    }
}