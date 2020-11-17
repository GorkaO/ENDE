package menuakGit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class menuak {
	public static void main(String[] args) {
		// Leer del fichero
				File fileEnero = new File("datos/datosparoenero.txt");
				File fileJulio = new File("datos/datosparojulio.txt");
				
				final int longitud=251;				
				
				String[] nombresEnero = new String[longitud];
				int[] numDesEnero = new int[longitud];				
				String[] provEnero = new String[longitud];
				String[] nombresJulio = new String[longitud];
				int[] numDesJulio = new int[longitud];				
				String[] provJulio = new String[longitud];				
				Scanner scan;
				scan = null;
				Scanner scan1;
				scan1 = null;
				int i = 0;
				try {
					scan = new Scanner(fileEnero);
					String linea;
					String[] partesLinea;
					// llenar el array con la información del fichero
					while (scan.hasNextLine()) {
						linea = scan.nextLine();
						partesLinea = linea.split(";");
						nombresEnero[i] = partesLinea[0];
						numDesEnero[i] = Integer.parseInt(partesLinea[1]);
						provEnero[i] = partesLinea[2];
						i = i + 1;
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				i=0;
				try {
					scan1 = new Scanner(fileJulio);
					String linea;
					String[] partesLinea;
					// llenar el array con la información del fichero
					while (scan1.hasNextLine()) {
						linea = scan1.nextLine();
						partesLinea = linea.split(";");
						nombresJulio[i] = partesLinea[0];
						numDesJulio[i] = Integer.parseInt(partesLinea[1].replace(".", ""));
						provJulio[i] = partesLinea[2];
						i = i + 1;
						System.out.println(i);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				
							
											
				// comprobar que los arrays de Enero están bien rellenados
				
				System.out.println("Datos Enero");
				
				for (int j = 0; j < nombresEnero.length; j++) {
					System.out.println(nombresEnero[j] + "" + numDesEnero[j] + "");					
				}
				System.out.println("Datos Julio");
				
		for (int j = 0; j < nombresJulio.length; j++) {
					System.out.println(nombresJulio[j] + "" + numDesJulio[j] + "");				
					
			}
				
				
	}

}

}
