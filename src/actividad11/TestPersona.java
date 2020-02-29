package actividad11;

import actividad10.Fecha;
import actividad11.Address;
import actividad11.Persona;
import actividad8.Nif;

public class TestPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona("Pere","Adriá",965523412);
        Address ad1 = new Address("Spain","Alicante","Alcoy",4);
        Fecha f1 = new Fecha(26, 9, 1997);
        Nif nif = new Nif("21697943");

        p1.toString();
        ad1.toString();
        f1.toString();
        nif.getNIF();
    }
}
