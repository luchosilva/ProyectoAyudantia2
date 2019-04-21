import java.util.Scanner;

public class Main {

    public static void main(String[]args){
       AlmacenPoleras a = new AlmacenPoleras();
       GestorArchivo.LeerArchivo(a.almacenPoleras);
       GestorArchivo.crearArchivo(a.almacenPoleras);
       GestorArchivo.agregarTexto(a.almacenPoleras);
       a.mostrarPoleras();
    }

    public static Polera crearPolera(){   //no tomar en cuenta es para hacer una mejor versión del programa después
        System.out.println("Ingrese el material de construcción:");
        String material =leerTexto();
        System.out.println("Ingrese la talla:");
        String talla = leerTexto();
        Polera p = new Polera(material,talla,preguntarEstampado());
        return p;
    }

    public static boolean preguntarEstampado(){ // no tomar en cuenta
        System.out.println("La polera tiene estampado?");
        System.out.println("Ingrese si o no:");
        String respuesta = leerTexto();
        if(respuesta.equalsIgnoreCase("si")){
            return true;
        }else{
            return false;
        }
    }

    public static String leerTexto(){ // no tomar en cuenta
        Scanner leer = new Scanner(System.in);
        return leer.nextLine();
    }




}
