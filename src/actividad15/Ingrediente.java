package actividad15;

public class Ingrediente {

    private String nombre;
    private double precio;

    Ingrediente (){
        nombre = "tomate";
        precio = 0.50;
    }

    public Ingrediente(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
