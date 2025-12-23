
void main() {
//lestura de archivos java
    String ruta = "D:\\DOCUMENTOS\\Documents\\curso\\ejemplo.txt";
    String ruta2 = "D:\\DOCUMENTOS\\Documents\\curso\\escritura.txt";
    String linea;// aux
    File file = new File(ruta); // objeto que representa donde se encuentra almacenado
    File escritura = new File(ruta2);
    try {
        //FileReader fr = new FileReader(file); //carga una copia de la ram
       // BufferedReader br = new BufferedReader(fr);// este lee la copia de la ram
       // while ((linea = br.readLine()) != null) {
           // System.out.println(linea);
        //}
        FileWriter fw = new FileWriter(escritura, true);
        fw.write("UN TEXTO DE PRUEBA, DEBE SER VISIBLE DENTRO DEL ARCHIVO");
        fw.write("Este es un nuevo texto de prueba");
        fw.close();//guardar los cambios dentro del archivo
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
}
