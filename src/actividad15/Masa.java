package actividad15;

public class Masa {

    private String nombre;
    private double precio;

    Masa (){
        nombre = "Masa Fina";
        precio = 1.50;
    }

    public Masa(String nombre, double price){
        this.nombre=nombre;
        this.precio=price;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }
}
