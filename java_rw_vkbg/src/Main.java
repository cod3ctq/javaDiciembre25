import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lectura de archivos con Java
        String ruta="C:\\Users\\veron\\OneDrive\\Escritorio\\vkbg.txt";
        File file = new File(ruta); //Rrepresentacion en memoria del archivo

        String linea; //aux

        String ruta2="C:\\Users\\veron\\OneDrive\\Escritorio\\escritura.txt";
        File escritura = new File(ruta2);

        try{
           // FileReader fr = new FileReader(file); //Cargar una copia del archivo en ram
           // BufferedReader br = new BufferedReader(fr); //Leer ese cache
           // while ( (linea=br.readLine())!=null ){
               // System.out.println(linea);
            //}
            FileWriter fw = new FileWriter(escritura, true);
            fw.write("UN TEXTO DE PRUEBA, DEBE SER VISIBLE DENTRO DEL ARCHIVO");
            fw.write("ESTE ES UN NUEVO TEXTO DE PRUEBA");
            fw.close(); //guardar los cambios dentro del archivo
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}