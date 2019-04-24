public class FichaMedica {

    private double peso;
    private double altura;
    private String alergia;//puede ser enum
    private String actividadFisica; //puede ser enum

    public FichaMedica(double peso, double altura, String alergia, String actividadFisica) {
        this.peso = peso;
        this.altura = altura;
        this.alergia = alergia;
        this.actividadFisica = actividadFisica;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
