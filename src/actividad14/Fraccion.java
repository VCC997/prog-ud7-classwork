package actividad14;

import java.util.concurrent.FutureTask;

public class Fraccion {

    private int num;

    private int den;

    public Fraccion() {

        num=0;
        den=1;
    }
    public Fraccion(int n, int d) {

        this.num=n;
        this.den=d;
    }

    public Fraccion sumar(int n, int d){

        Fraccion suma = new Fraccion();
        /*num=a.num*b.den+b.num*a.den*/
        suma.num=n*d+den*n;
        /*den=a*.den*b.den*/
        suma.den=n*d;

        return suma;
    }

    public Fraccion restar(int n, int d){

        Fraccion resta = new Fraccion();
        /*num=a.num*b.den-b.num*a.den*/
        resta.num=n*d-den*n;
        /*den=a*.den*b.den*/
        resta.den=n*d;

        return resta;
    }

    public Fraccion multiplicar(int n, int d){

        Fraccion multiply = new Fraccion();
        /*num=a.num*b.num*/
        multiply.num=den*n+d;
        /*den=a.den*b.den*/
        multiply.den=n*d+n;

        return multiply;
    }

    public Fraccion dividir(int n, int d){

        Fraccion division = new Fraccion();
        /*num=a.num*b.n+den*/
        division.num=den*n/d;
        /*den=a.den*b.d+num*/
        division.den=num*d/n;

        return division;
    }
}

