public class Trabajador extends Persona {

    private String numTelefonico;
    private String empresa;
    private String areaTrabajo; // area dentro de la empresa que desempeña el trabajador
    private String rol; // rol del trabajador especificado en el contrato(Médico,Ingeniero,etc) nota:puede ser enum
    private String tipoContrato; // indefinido,part-time,etc nota:puede ser enum
    private ControlHorario controlHorario;

    public Trabajador(String nombre, String apellido, String segundoApellido, String rut, String correo, String numTelefonico, String empresa, String areaTrabajo, String rol, String tipoContrato, ControlHorario controlHorario) {
        super(nombre, apellido, segundoApellido, rut, correo);
        this.numTelefonico = numTelefonico;
        this.empresa = empresa;
        this.areaTrabajo = areaTrabajo;
        this.rol = rol;
        this.tipoContrato = tipoContrato;
        this.controlHorario = controlHorario;
    }

    @Override
    public String toString(){
        return "Nombre:"+this.nombre+" Apellido:"+this.apellido+""+this.segundoApellido+" Rut:"+this.rut+" Correo electrónico:"+this.correo+" Teléfono:"+this.numTelefonico+"Área de trabajo:"+this.areaTrabajo+" Rol:"+this.rol+" Contrato"+this.tipoContrato;
    }
}
