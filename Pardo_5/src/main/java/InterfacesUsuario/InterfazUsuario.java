package InterfacesUsuario;

import Canciones.*;

import java.util.Scanner;

public class InterfazUsuario {

	private GestorCanciones listaCanciones;

	public InterfazUsuario() {
		listaCanciones = new GestorCanciones();
	}

	/**
	 * ingresa a la lista de canciones las 4 canciones de los archivos con sus respectivas letras
	 * @param gestorArchivo instancia para uso de gestorArchivo
	 * @return void
	 */
	public void agregarCancionesDeArchivos(GestorArchivo gestorArchivo){
		listaCanciones.agregarCancion(new Cancion("Put you on the game","The Game","The Documentary","2005",gestorArchivo.guardarLetra(gestorArchivo.leerArchivo(rutaCancion1()))));
		listaCanciones.agregarCancion(new Cancion("Dreams","The Game","The Documentary","2005",gestorArchivo.guardarLetra(gestorArchivo.leerArchivo(rutaCancion2()))));
		listaCanciones.agregarCancion(new Cancion("Space Bound","Eminem","Recovery","2010",gestorArchivo.guardarLetra(gestorArchivo.leerArchivo(rutaCancion3()))));
		listaCanciones.agregarCancion(new Cancion("Maquiavelico","Canserbero","Muerte","2012",gestorArchivo.guardarLetra(gestorArchivo.leerArchivo(rutaCancion4()))));
	}
	/**
	 * menu de interaccion con el usuario agrega,quita,y muestra canciones y sus letras.
	 * @return void
	 */
	public void menu() {
		boolean salir = false;
		while (!salir) {
			try {
				mostrarOpciones();
				int opcion = leerEntero();
				if (opcion > 5 || opcion < 1) {
					System.out.println("La opción ingresada no es válida, inténtelo nuevamente.");
				} else {
					switch (opcion) {
						case 1: {
							listaCanciones.agregarCancion(ingresarDatosCancion(crearCancion()));break;
						}
						case 2: {
							listaCanciones.quitarCancion(quitarCancionPorNombre(crearCancion()));break;
						}
						case 3: {
							listaCanciones.mostrarCanciones();break;
						}
						case 4: {
							listaCanciones.mostrarLetraCancion(mostrarLetraCancionPorNombre(crearCancion()));break;
						}
						case 5:{
							salir = true;
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Valor no esperado, inténtelo nuevamente.");
			}
		}
	}

	/**
	 * muestra las distintas opciones del menu
	 * @return void
	 */
	public void mostrarOpciones() {
		System.out.println("[1].-Agregar canción a la lista");
		System.out.println("[2].-Eliminar canción de la lista");
		System.out.println("[3].-Mostrar listado de canciones.");
		System.out.println("[4].-Ver letra de cancion.");
		System.out.println("[5].-Salir.");
	}

	/**
	 * crea cancion con valores por defecto(constructor sin parámetros)
	 * @return cancion con valores por defecto
	 */
	public Cancion crearCancion() {
		return new Cancion();
	}

	/**
	 * ingresa todos los valóres de los atributos de una canción para añadirlos a la lista de canciones.
	 * @param cancion recibe cancion con valores por defecto.
	 * @return cancion con valores ingresados por el usuario.
	 */
	public Cancion ingresarDatosCancion(Cancion cancion) {
		System.out.println("Ingrese el nombre de la canción:");
		cancion.setNombre(leerTexto());
		System.out.println("Ingrese el Grupo o interprete:");
		cancion.setInterprete(leerTexto());
		System.out.println("Ingrese el nombre del album:");
		cancion.setAlbum(leerTexto());
		System.out.println("Ingrese el año de lanzamiento:");
		cancion.setAnio(leerTexto());
		return cancion;
	}

	/**
	 * crea una cancion solo modificando nombre para ser usada de parametro en el metodo mostrarLetraCancion()
	 * @param cancion del metodo crearCancion()
	 * @return Cancion con solo valor del nombre asignado
	 */
	public Cancion mostrarLetraCancionPorNombre(Cancion cancion){
		System.out.println("Ingrese el nombre de la canción que desea ver la letra:");
		cancion.setNombre(leerTexto());
		return cancion;
	}

	/**
	 * crea una cancion solo modificando nombre para ser usada de parametro en el metodo quitarCancion()
	 * @param cancion del metodo crearCancion()
	 * @return Cancion con solo valor del nombre asignado
	 */
	public Cancion quitarCancionPorNombre(Cancion cancion){
		System.out.println("Ingrese el nombre de la canción que desea quitar:");
		cancion.setNombre(leerTexto());
		return cancion;
	}

	/**
	 * lee por teclado un String
	 * @return String leido por teclado
	 */
	public String leerTexto(){
		Scanner leer = new Scanner(System.in);
		return leer.nextLine();
	}

	/**
	 * métodos usados para establecer rutas de las letras de las cannciones
	 * @return ruta de archivos de las letras
	 */
	public String rutaCancion1(){
		return "C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_5/src/Archivos/put_you_on_the_game.txt";
	}

	public String rutaCancion2(){
		return "C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_5/src/Archivos/dreams.txt";
	}

	public String rutaCancion3(){
		return "C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_5/src/Archivos/space_bound.txt";
	}

	public String rutaCancion4(){
		return "C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_5/src/Archivos/maquavelico.txt";
	}

	/**
	 * leer por teclado un entero(se usa en el menu)
	 * @return int leido por teclado
	 */
	public int leerEntero() {
		Scanner leer = new Scanner(System.in);
		return leer.nextInt();
	}

}