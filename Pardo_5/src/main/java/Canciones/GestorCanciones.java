package Canciones;

import java.util.ArrayList;

public class GestorCanciones {

	private ArrayList<Cancion> listaCanciones;

	public GestorCanciones() {
		listaCanciones = new ArrayList<Cancion>();
	}

	/**
	 * agregar una cancion a la lista
	 * @param cancion ya inicializada con valores ingresador por el usuario
	 * @return void
	 */
	public void agregarCancion(Cancion cancion) {
		this.listaCanciones.add(cancion);
	}

	/**
	 * muestra la canciones agregadas a la lista
	 * @return void
	 */
	public void mostrarCanciones() {
		for (Cancion c:listaCanciones){
			System.out.println(c.toString());
		}
	}

	/**
	 * muestra la letra de la cancion si coincide con el nombre del parametro
	 * @param cancion se crea un objeto modificando solo el nombre
	 * @return void
	 */
	public void mostrarLetraCancion(Cancion cancion){
		for (Cancion c:listaCanciones) {
			if (c.getNombre().equalsIgnoreCase(cancion.getNombre())) {
				c.toStringLetra();
			}
		}
	}

	/**
	 * quita de la lista la canción que coincida con el valor del nombre de la cancion por parametro.
	 * @param cancion inicializada con el nombre ingresado por el usuario
	 * @return void
	 */
	public void quitarCancion(Cancion cancion) {
		for (Cancion c:listaCanciones){
			if (c.getNombre().equalsIgnoreCase(cancion.getNombre())){
				this.listaCanciones.remove(c);
				System.out.println("Se ha eliminado la canción exitosamente");
			}
		}
	}

	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}
}