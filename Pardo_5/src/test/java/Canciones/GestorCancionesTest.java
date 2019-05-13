package Canciones;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorCancionesTest {

    @Test
    public void agregarCanciontest() {
        GestorCanciones g = new GestorCanciones();
        g.agregarCancion(new Cancion());
        Assertions.assertTrue(g.getListaCanciones().get(0)!=null);
    }

    @Test
    public void agregarCanciontest2() {
        GestorCanciones g = new GestorCanciones();
        g.agregarCancion(new Cancion("Back in Black","ACDC","Jekill","2040",new String[5]));
        Assertions.assertTrue(g.getListaCanciones().get(0).getInterprete().equalsIgnoreCase("Acdc"));
        Assertions.assertTrue(g.getListaCanciones().get(0).getNombre().equalsIgnoreCase("back in black"));
    }

}