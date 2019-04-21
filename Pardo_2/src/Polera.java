public class Polera {

    private String id;
    private String material;
    private String talla;
    private boolean estampado;

    public Polera(String material,String talla,boolean estampado){
        this.id = calcularId();
        this.material=material;
        this.talla = talla;
        this.estampado = estampado;
    }

    public final String calcularId() {
        String result = java.util.UUID.randomUUID().toString();
        result.replaceAll("-", "");
        result =result.substring(0, 6);
        return result;
    }

    public String toString(){
        return "ID:"+this.id+" Material de construccion:"+this.material+" Talla:"+this.talla+" Estampado:"+this.estampado+"\n";
    }
}
