package actividad9;

public class Punto {

    private double coorX;

    private double coorY;

    public Punto(double X, double Y){
         this.coorX=X;
         this.coorY=Y;
     }

     public double getDistance(Punto p2){

        double aux = Math.pow(p2.getCoorX() - coorX,2) + Math.pow(p2.getCoorY() - coorY,2);
        return Math.sqrt(aux);
     }

     public  void getCoordinade(){
         System.out.printf("(%f,%f)\n");
     }

    public double getCoorX() {
        return coorX;
    }

    public void setCoorX(double coorX) {
        this.coorX = coorX;
    }

    public double getCoorY() {
        return coorY;
    }

    public void setCoorY(double coorY) {
        this.coorY = coorY;
    }

    @Override
    public String toString() {
        return "{" + coorX + "," + coorY + '}';
    }
}
