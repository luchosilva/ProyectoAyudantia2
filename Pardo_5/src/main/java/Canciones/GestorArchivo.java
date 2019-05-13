package Canciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorArchivo {

	public GestorArchivo() {
	}

	/**
	 * guarda en arraylist la letra de la cancion de un archivo linea por linea
	 * @param ruta ruta del archivo a usar
	 * @return ArrayList con la letra de la cancion
	 */
	public ArrayList leerArchivo(String ruta) {
		ArrayList<String> letra= new ArrayList<String>();
		try{
			FileReader archivo = new FileReader(ruta);
			BufferedReader bufferedReader = new BufferedReader(archivo);
			String linea = "";
			while ((linea=bufferedReader.readLine())!=null){
			letra.add(linea);
			}
			archivo.close();
			bufferedReader.close();
		}catch (IOException e){
			System.out.println("Archivo no encontrado");
		}
	return letra;
	}

	/**
	 * transfiere la letra del ArrayList a un array de tipo String[]
	 * @param letra recibida desde el metodo leerArchivo
	 * @return String[] con letra de cancion para ingresar a constructor de cancion
	 */
	public String[] guardarLetra(ArrayList<String> letra){
		String[] letraCompleta = new String[letra.size()];
			for (int i=0;i<letraCompleta.length;i++){
				letraCompleta[i]=letra.get(i);
			}
	return letraCompleta;
	}

}