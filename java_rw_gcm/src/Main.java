import jdk.internal.org.jline.terminal.Terminal;

import java.io.*;
import java.nio.Buffer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //lectura de archivos con java

        String ruta = "C:\\Users\\gusta\\OneDrive\\Desktop\\Nuevo texto.txt";
        String ruta2 = "\"C:\\Users\\gusta\\OneDrive\\Desktop\\Escritura.txt\"";
        File escritura = new File(ruta2);
        try {


            String liena; //aux
            File escritura = new File(ruta2);
            try {
                FileReader fr = new FileReader(file); //carga una copia del contenido en ram
                BufferedReader br = new BufferedReader(fr);//ller ese cache
                while ((liena = br.readLine()) != null) {
                    System.out.println(liena);

                    FileWriter fm = new FileWriter(escritura);

                    fw.writer();"un texto de prueba debe ser visible denrto dek archivo");
                    fw.close();//guardar los cambios dentro del archivo
                } catch(IOException e){
                    throw new RuntimeException(e);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}