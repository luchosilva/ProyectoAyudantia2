package InterfacesUsuario;

import Canciones.Cancion;
import org.junit.Assert;

import static org.junit.Assert.*;

public class InterfazUsuarioTest{

    @org.junit.Test
    public void crearCancion() {
        InterfazUsuario i = new InterfazUsuario();
        Cancion c = i.crearCancion();
        assertEquals(true,c!=null);
    }

    @org.junit.Test
    public void ingresarDatosCancion() {
        InterfazUsuario i = new InterfazUsuario();
        Cancion c = i.ingresarDatosCancion(i.crearCancion());
        assertEquals(true,c!=null);
    }


}