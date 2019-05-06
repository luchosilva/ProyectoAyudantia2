import java.io.*;
import java.nio.BufferOverflowException;

public class GestorArchivo {

    public GestorArchivo(){

    }

    /**
     * lee el archivo de texto y lo muestra por pantalla
     */
    public void leerArchivo(){
        String linea;
        try {
            FileReader archivo = new FileReader("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_1/src/Archivos/texto.txt");
            BufferedReader bufferedReader = new BufferedReader(archivo);
            while ((linea=bufferedReader.readLine())!=null){
                System.out.println(linea);
            }
            archivo.close();
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("Archivo no encontrado.");
        }
    }

    /**
     * agrega una linea de texto al archivo
     * @param texto
     */
    public void agregarLinea(String texto){
        FileWriter archivo;
        try{
             archivo= new FileWriter("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_1/src/Archivos/texto.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(archivo);
            bufferedWriter.write(texto);
            bufferedWriter.close();
            archivo.close();
        }catch (IOException E){
            System.out.println("Archivo no encontrado.");
        }
    }
}
