package java_rw_lfmh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] dias = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once",
				"doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
				"veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete",
				"veintiocho", "veintinueve", "treinta", "treinta y uno" };

		// Array con los nombres de los meses del año
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		
		String ruta1 = "C:\\Users\\lui_7\\OneDrive\\Escritorio\\fechas.txt";
		String ruta2 = "C:\\Users\\lui_7\\OneDrive\\Escritorio\\Escritura.txt";

		String linea;

		File lectura = new File(ruta1);
		File escritura = new File(ruta2);

		try {
			FileWriter fw = new FileWriter(escritura);
			FileReader fr = new FileReader(lectura);
			BufferedReader br = new BufferedReader(fr);

			int dia, mes, anio;

			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				dia = Integer.parseInt(linea.substring(0, 2));
				mes = Integer.parseInt(linea.substring(2, 4));

				System.out.println("Dia: " + dia);
				System.out.println("Mes: " + mes);

				for (int i=0; i < dias.length; i++) {
					if (dia - 1 == i) {
						fw.write(dias[i] + " de ");
						for (int j=0; j < meses.length; j++) {
							if (mes - 1 == j) {
								fw.write(meses[j] + " del año " + linea.substring(4) + "\n");

							}
						}
					}

				}

			}
			fw.close();
			fr.close();
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
