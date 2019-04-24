import java.util.ArrayList;

public class Alumno extends Persona{

    private String matricula;
    private TablaAsistencia asistencia;
    private TablaNotas notas;
    private Apoderado apoderado;

    public Alumno(String nombre, String apellido, String segundoApellido, String rut, String correo, String matricula, TablaAsistencia asistencia, TablaNotas notas, Apoderado apoderado) {
        super(nombre, apellido, segundoApellido, rut, correo);
        this.matricula = matricula;
        this.asistencia = asistencia;
        this.notas = notas;
        this.apoderado = apoderado;
    }

    @Override
    public String toString() {
        return "Nombre:"+this.nombre+" Apellido:"+this.apellido+""+this.segundoApellido+" Rut:"+this.rut+" Correo electrónico:"+this.correo+"Mátricula:"+this.matricula;
    }
}
