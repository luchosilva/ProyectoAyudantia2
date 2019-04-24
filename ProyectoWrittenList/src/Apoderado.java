public class Apoderado extends Persona {

    private String numTelefonico;

    public Apoderado(String nombre, String apellido, String segundoApellido, String rut, String correo, String numTelefonico) {
        super(nombre, apellido, segundoApellido, rut, correo);
        this.numTelefonico = numTelefonico;
    }


}
