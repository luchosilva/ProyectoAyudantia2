package Canciones;

import java.util.Arrays;

public class Cancion {

	private static int idActual=1;
	private int id;
	private String nombre;
	private String interprete;
	private String album;
	private String anio;
	private String[] letra;

	/**
	 * Constructor usado para crear canciones del usuario por teclado
	 */
	public Cancion() {
		this.id=idActual++;
	}

	/**
	 * Constructor usado para guardar los objetos desde los archivos
	 * @param nombre
	 * @param interprete
	 * @param album
	 * @param anio
	 * @param letra
	 */
	public Cancion(String nombre, String interprete, String album, String anio,String[] letra) {
		this.id=idActual++;
		this.nombre = nombre;
		this.interprete = interprete;
		this.album = album;
		this.anio = anio;
		this.letra=letra;
	}

	public int getId() {
		return this.id;
	}

	public void setId() {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInterprete() {
		return this.interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public String getAlbum() {
		return this.album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAnio() {
		return this.anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String[] getLetra() {
		return this.letra;
	}

	public void setLetra(String[] letra) {
		this.letra = letra;
	}

	/**
	 * muestra los valores actuales de los atributos
	 * @return una cadena con los valores
	 */
	@Override
	public String toString() {
		return "Id:"+id+", Nombre:"+nombre+", Interprete:"+interprete+", Album:"+album+", Año:"+anio;
	}

	/**
	 * muestra letra de la canción
	 * @return void
	 */
	public void toStringLetra() {
		for (int i=0;i<letra.length;i++){
			System.out.println(letra[i]);
		}
	}
}