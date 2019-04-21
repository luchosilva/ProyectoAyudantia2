import java.util.ArrayList;

public class AlmacenPoleras {

    ArrayList<Polera> almacenPoleras;

    public AlmacenPoleras() {
        this.almacenPoleras = new ArrayList<>();
    }

    public void ingresarPolera(Polera p) {
        almacenPoleras.add(p);
    }

    public void mostrarPoleras(){
        for (Polera p: almacenPoleras){
            System.out.println(p.toString());
        }
    }

}
