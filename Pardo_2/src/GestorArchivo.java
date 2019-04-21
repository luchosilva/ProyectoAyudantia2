import java.io.*;
import java.util.ArrayList;

public class GestorArchivo {

    public static void LeerArchivo(ArrayList poleras){ // crea los 5 objetos con los datos del excel dado
        FileReader archivo;
        int lineasLeidas =0;
        String[] datos;
        try{
            archivo = new FileReader("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_2/listado.csv");
            BufferedReader bufferedReader = new BufferedReader(archivo);
            String linea = "";
            while((linea=bufferedReader.readLine())!=null){
                lineasLeidas++;
                if (lineasLeidas>1){
                    datos = linea.split(",");
                    Polera p = new Polera(datos[0],datos[1],datos[2].startsWith("t"));
                    poleras.add(p);
                }
            }
            bufferedReader.close();
            archivo.close();
        }catch (IOException e){
            System.out.println("No se ha podido encontrar el archivo.");
        }
    }

    public static void crearArchivo(ArrayList<Polera> listaPoleras){ // crea archivo .csv con los 5 objetos del excel dado
        FileWriter archivo;
        try{
            archivo = new FileWriter("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_2/ListadoPoleras2.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(archivo);
            for(Polera polera: listaPoleras){
               bufferedWriter.write(polera.toString());
            }
            bufferedWriter.close();
            archivo.close();
        }catch (IOException e){
            System.out.println("Archivo no encontrado.");
        }
    }

    public static void agregarTexto(ArrayList<Polera> listaPoleras){ //agrega el ultimo objeto polera pedido
        FileWriter archivo;
        try{
            archivo = new FileWriter("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_2/ListadoPoleras2.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(archivo);
            Polera p = new Polera("algodon","XL",false);
            listaPoleras.add(p);
            bufferedWriter.write(p.toString());
            bufferedWriter.close();
            archivo.close();
        }catch (IOException e){
            System.out.println("Archivo no encontrado.");
        }
    }
}
