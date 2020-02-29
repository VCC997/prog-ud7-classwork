package actividad7;

import java.util.Scanner;

public class TestVideojuego {

    public static void main(String[] args) {

        Videojuego[] listadoVideoJuegos = new Videojuego[5];

        for (int i = 0; i < 5; i++) {
            listadoVideoJuegos[i]= getVideojuego();
            System.out.println(listadoVideoJuegos[i]);
        }
        int cheaper= getCheaper(listadoVideoJuegos);

        System.out.println(listadoVideoJuegos[cheaper]);
    }
    public static Videojuego getVideojuego(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el nombre");
        String nombre = scanner.nextLine();
        System.out.println("introduce el genero");
        String genero = scanner.nextLine();
        System.out.println("introduce el precio");
        Double precio = scanner.nextDouble();

        Videojuego videojuego = new Videojuego(nombre,genero,precio);
        return videojuego;
    }

    private static int getCheaper(Videojuego[] listadoVideoJuegos){

        int minor=0;

        for (int i = 0; i < listadoVideoJuegos.length ; i++) {

            if (listadoVideoJuegos[i].getPrecio() < listadoVideoJuegos[minor].getPrecio()){
                minor=i;
            }
        }
        return minor;
    }
}
