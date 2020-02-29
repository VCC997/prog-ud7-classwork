package actividad8;

public class Nif {

    private char letra;

    private String DNI;

    public Nif(String dni){
        this.DNI=dni;
        getDniLetter();
    }

    public void getDniLetter(){

        final String TRASNPOSITION = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dniNumber = Integer.parseInt(DNI);
        letra =TRASNPOSITION.charAt(dniNumber%23);
    }

    public String getNIF() {
        return DNI + letra;
    }

}
