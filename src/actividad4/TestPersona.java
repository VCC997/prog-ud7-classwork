package actividad4;

public class TestPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan","Perez",30,false);
        Persona p2 = new Persona("Paco","Adria",23,false);

        p1.saluda();
        p2.saluda();

    }
}
