package actividad11;

import actividad10.Fecha;
import actividad11.Address;
import actividad8.Nif;

import java.util.Date;

public class Persona {

    private Fecha fechaNacimiento;

    private Address address;

    private Nif nif;

    private String nombre;
    private String apellidos;
    private int telefono;



    public Persona(String nomb, String apell, int tlf){
        this.nombre=nomb;
        this.apellidos=apell;
        this.telefono=tlf;


    }

    @Override
    public String toString() {
        return "Persona{" + ", nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\'' + ", telefono=" + telefono + '}';
    }
}



