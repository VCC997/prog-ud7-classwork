package actividad9;

public class TestPunto {
    public static void main(String[] args) {

        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(5,3);
        Punto punto3 = new Punto(2,-1);
        double cordX = punto2.getCoorX() - punto3.getCoorX()/2;
        double cordY = punto2.getCoorY() - punto3.getCoorY()/2;

        Punto punto4 = new Punto(cordX, cordY);
        Punto punto5 = new Punto(4, 3);

        System.out.printf("La distancia del %s a %s es %f",punto1.getCoorX(),punto5.getCoorX(),punto1.getDistance(punto5));
    }
}
