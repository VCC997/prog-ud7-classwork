
package actividad4;

/**
 * Crea una clase Persona. De cada persona queremos almacenar su nombre, apellidos, edad y si está casado o no.
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;

    public Persona(String name, String surname, int age, boolean married){

        this.nombre = name;
        this.apellidos = surname;
        this.edad = age;
        this.casado = married;
    }

    public Persona(String name, String surname, int age){

        this.nombre = name;
        this.apellidos = surname;
        this.edad = age;
        this.casado = false;
    }

    public void saluda(){

        System.out.printf("Hola, soy"+" "+nombre+" mi edad es"+" "+edad+"y"+" "+casado+" estoy casado");
    }
}
