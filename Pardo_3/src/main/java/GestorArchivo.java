import java.io.*;
import java.util.ArrayList;

public class GestorArchivo {

    /**
     * elimina todos las expresiones innecesarias del texto y crea los objetos correspondientes
     * @param zapatillas
     */
    public static void crearZapatillas(ArrayList<Zapatilla> zapatillas) { //para crear objeto
        String lineaTexto;
        String[] datos;
        try {
            FileReader archivo = new FileReader("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_3/src/Archivos/zapatillas.json");
            BufferedReader bufferedReader = new BufferedReader(archivo);
            while ((lineaTexto = bufferedReader.readLine()) != null) {
                lineaTexto = lineaTexto.replaceAll("[{}\"\\]\\[:]", "");
                lineaTexto = lineaTexto.replaceAll("(zapatillas)", "");
                lineaTexto = lineaTexto.replaceAll("(marca)", "");
                lineaTexto = lineaTexto.replaceAll("(modelo)", "");
                lineaTexto = lineaTexto.replaceAll("(color)", "");
                lineaTexto = lineaTexto.replace(" ", "");
                datos = lineaTexto.split(",");
                Zapatilla zapatilla = new Zapatilla(datos[0], datos[1], datos[2]);
                zapatillas.add(zapatilla);
            }
            bufferedReader.close();
            archivo.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }

    /**
     * elimina las expresiones ]} de la ultima linea y guarda el texto modificado en datos
     * @return String[] datos
     */
        public static String[] guardarNuevoTexto() {
            String[] datos= new String[7];
            String lineaTexto="";
            int lineasLeidas=0;
            try {
                FileReader archivo = new FileReader("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_3/src/Archivos/zapatillas.json");
                BufferedReader bufferedReader = new BufferedReader(archivo);
                while ((lineaTexto = bufferedReader.readLine()) != null) {
                    lineaTexto=lineaTexto.replaceAll("(\\]})","");
                    datos[lineasLeidas]=lineaTexto;
                    lineasLeidas++;
                }
                bufferedReader.close();
                archivo.close();
            } catch (IOException e) {
                System.out.println("Archivo no encontrado");
            }
          return datos;
        }

    /**
     *  añade el nuevo objeto al texto modificado
     * @param zapatillas
     * @param datos
     */
    public static void agregarTexto(ArrayList<Zapatilla> zapatillas,String[]datos){ //para aniadir objeto
            FileWriter archivo;
            try{
                archivo = new FileWriter("C:/Users/Rodrigo/Documents/Proyectos Java/Pardo_3/src/Archivos/zapatillas.json");
                BufferedWriter bufferedWriter = new BufferedWriter(archivo);
                for (int i=0;i<datos.length;i++){
                    bufferedWriter.write(datos[i]+"\n");
                }
                Zapatilla zapatilla= new Zapatilla("Nike","AirForce1","Black");
                zapatillas.add(zapatilla);
                bufferedWriter.write(zapatilla.toString()+"]}");
                bufferedWriter.close();
                archivo.close();
            }catch (IOException e){
                System.out.println("Archivo no encontrado.");
            }
        }
    }





