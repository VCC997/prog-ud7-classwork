package actividad16;

public class Reloj {

    private int horas;
    private int minutos;
    private int segundos;
    private String marca;
    private String modelo;
    private double precio;

    Reloj(){

        horas = 0;
        minutos = 0;
        segundos = 0;
        marca = null;
        modelo = null;
        precio = 0.0;
    }

    public Reloj(int h, int m, int s){

        this.horas=h;
        this.minutos=m;
        this.segundos=s;
    }

    public String ponerEnHora(int h, int m){

        if (h == 0 || m == 0) {
            segundos = 0;
        }
        return 0+":"+0+":"+segundos;
    }

    public int getHoras(){

        return horas;
    }

    public void setHoras(int h){

        this.horas=h;
    }

    public int getMinutos(){

        return minutos;
    }

    public void setMinutos(int m){

        this.minutos=m;
    }

    public int getSegundos(){

        return segundos;
    }

    public void setSegundos(int s){

        this.segundos=s;
    }

    public String getMarca(){

        return marca;
    }

    public void setMarca(String ma){

        this.marca=ma;
    }
}

