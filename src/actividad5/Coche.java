package actividad5;

public class Coche {

    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    public enum Tipo {MINI, UTILITARIO, FAMILIAR, DEPORTIVO};
    private Tipo tipo;
    private int fabricadoEn;
    private TipoSeguro seguro;

    public Coche(){

        modelo = "Seat Toledo";
        color = "Rojo";
        metalizada = false;
        fabricadoEn = 2020;
        tipo = Tipo.FAMILIAR;
        seguro = TipoSeguro.TERCEROS;
        matricula = "111111";

    }

    public Coche(String modelo, String color, boolean metalizada, String matricula, Tipo tipo, int fabricadoEn, TipoSeguro seguro){

        this.metalizada= metalizada;
        this.color=color;
        this.modelo=modelo;
        this.fabricadoEn=fabricadoEn;
        this.matricula=matricula;
        this.seguro=seguro;
        this.tipo=tipo;
    }

    public void mostrarInfo(){
        System.out.printf("Modelo"+" "+modelo+" "+"Color"+" "+color+" "+"Metalizado"+" "+metalizada+" "+
                "fabricadoEn"+" "+fabricadoEn+" "+"Matricula"+" "+matricula+" "+"Tipo de Seguro"+" "+seguro+" "+"Tipo"+" "+tipo);
    }
}
