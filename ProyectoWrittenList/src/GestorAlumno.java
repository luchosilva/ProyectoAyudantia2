import java.util.ArrayList;

public class GestorAlumno {

    private ArrayList<Alumno> alumnos;

    public GestorAlumno(){
        alumnos = new ArrayList<>();
    }

    public void aniadirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
}
