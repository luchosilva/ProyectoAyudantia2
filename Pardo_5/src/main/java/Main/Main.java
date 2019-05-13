package Main;

import Canciones.GestorArchivo;
import Canciones.GestorCanciones;
import InterfacesUsuario.InterfazUsuario;

public class Main {


	public static void main(String[] args) {
		InterfazUsuario launcher = new InterfazUsuario();
		launcher.agregarCancionesDeArchivos(new GestorArchivo());
		launcher.menu();
	}

}