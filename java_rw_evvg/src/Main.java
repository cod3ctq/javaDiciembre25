import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lectura de archivos con java
        //Primero definir la ruta de donde está el archvivo
//        String ruta="C:\\Users\\evalv\\Desktop\\prueba-texto.txt";
//        String linea; //aux

        String ruta2="C:\\Users\\evalv\\Desktop\\escritura.txt";
        File escritura = new File(ruta2);

//        File file = new File(ruta);
        //Representacion en memoria del arx
        //El proceso de lectura tiene que ir dentro de un try-caatch
        //Porque puede tener excepciones
        try{
            FileWriter fw =new FileWriter(escritura);
            fw.write("UN TEXTO DE PRUEBA, DEBE SER VISIBLE DENTRO DEL ARCHICO");
            fw.write(" Necesito ayuda");



            fw.close();
//            FileReader fr = new FileReader(file);//Hace posibilitar que una vez se encontró el arx, carga una copia del contenidoe n la ram
//            BufferedReader br = new BufferedReader(fr);//leer ese cache
//            while ( (linea= br.readLine())!=null ){//Revisa cada linea, siempre y cuando haya algo entonces
//                System.out.println(linea);//Se va a imprimir lo que salga en esa linea

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        }
    }
