public class Main {

    public static void main(String[]args){
        GestorZapatilla gz = new GestorZapatilla();
        GestorArchivo.agregarTexto(gz.getZapatillas(),GestorArchivo.guardarNuevoTexto());
        GestorArchivo.crearZapatillas(gz.getZapatillas());
        gz.mostrarZapatillas();
    }
}
