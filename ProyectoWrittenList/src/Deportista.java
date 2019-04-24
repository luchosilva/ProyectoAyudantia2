public class Deportista extends Persona {

    private String matricula;
    private String numTelefonico;
    private String planAsignado; //pueden ser enum
    private String fechaMatricula;
    private FichaMedica fichaMedica;

    public Deportista(String nombre, String apellido, String segundoApellido, String rut, String correo, String matricula, String numTelefonico, String planAsignado, String fechaMatricula, FichaMedica fichaMedica) {
        super(nombre, apellido, segundoApellido, rut, correo);
        this.matricula = matricula;
        this.numTelefonico = numTelefonico;
        this.planAsignado = planAsignado;
        this.fechaMatricula = fechaMatricula;
        this.fichaMedica = fichaMedica;
    }



    private double calcularIMC(){
        return fichaMedica.getPeso()/Math.pow(fichaMedica.getAltura(),2);
    }

}
