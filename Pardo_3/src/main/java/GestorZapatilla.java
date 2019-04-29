import java.util.ArrayList;

public class GestorZapatilla {

    private ArrayList<Zapatilla> zapatillas;

    public GestorZapatilla(){
        zapatillas=new ArrayList<Zapatilla>();
    }

    public void aniadirZapatilla(Zapatilla zapatilla){
        zapatillas.add(zapatilla);
    }

    public void mostrarZapatillas(){
        for (Zapatilla zapatilla: zapatillas){
            System.out.println(zapatilla.toString());
        }
    }

    public ArrayList<Zapatilla> getZapatillas() {
        return zapatillas;
    }
}
