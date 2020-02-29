package actividad15;

import java.util.Arrays;

public class Pizza {

    public static final int NUMMAX_INGREDIENTES = 5;
    private String nombre;
    private double precio;
    private Ingrediente[] ingredientes ;
    private Masa masa;


    Pizza(double price, String name){

        nombre = "Margarita";
        precio = 6.0;

    }

    public Pizza(String name, double price,Ingrediente ingredient, Masa mass){

        this.nombre=name;
        this.precio=price;
        this.ingredientes[0] = ingredient;
        this.masa=mass;
    }

    public boolean añadirIngredient(Ingrediente ingredient, int NUMMAX_INGREDIENTES){

        Ingrediente[] addIngredientes = new Ingrediente[NUMMAX_INGREDIENTES];

        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[0] == null){
                addIngredientes[0] = ingredientes[0];
                i++;
                return true;
            }else {
                return false;
            }
        }
        return true;
    }

    public double getPrecio(String nombre,double precio){

        if(nombre == null){
            precio = 0;
        }
        return precio;
    }


    @Override
        public String toString() {

        return "Nombre:"+nombre+"Precio:"+precio+"Ingrediente:"+ingredientes+"Masa:"+masa;
        }
}
