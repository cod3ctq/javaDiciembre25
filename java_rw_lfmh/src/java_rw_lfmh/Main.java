package java_rw_lfmh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lectura de archivos con java
		String ruta = "C:\\Users\\lui_7\\OneDrive\\Escritorio\\Escritura.txt";
		String linea;
		File file = new File(ruta);
		File escritura = new File(ruta);
		try {
//			FileReader fr = new FileReader(file);
//			BufferedReader br = new BufferedReader(fr);
//			while( (linea=br.readLine())!=null) {
//				System.out.println(linea);
//			}
			
			FileWriter fw = new FileWriter(escritura,true);
			
			for(int i=0; i<10; i++) {
				fw.write(i+"\n");
			}
			
//			fw.write("Un tecto de pruebs ");
//			fw.write("Un texto de confirmacion");
			fw.close();
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
