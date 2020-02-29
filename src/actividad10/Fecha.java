package actividad10;

import java.util.Date;

public class Fecha {

    private int dia;

    private int mes;

    private int año;

    public Fecha (int day, int month, int year){

        this.dia=day;
        this.mes=month;
        this.año=year;
    }

    public boolean fechaCorrecta() {

        boolean diaCorrecto;
        boolean mesCorrecto;
        boolean añoCorrecto;

        añoCorrecto = año > 0;
        mesCorrecto = mes >= 1 && mes <= 12;

        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 3:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    private boolean esBisiesto() {

        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    public void diaSiguiente() {

        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                año++;
            }
        }
    }

    public int getDia() {

        return dia;
    }

    public void setDia(int day) {

        this.dia = day;
    }

    public int getMes() {

        return mes;
    }

    public void setMes(int month) {

        this.mes = month;
    }

    public int getAño() {

        return año;
    }

    public void setAño(int year) {

        this.año = year;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        if (dia < 10) {
            sb.append("0");
        }

        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }

        sb.append(mes);
        sb.append("-");
        sb.append(año);
        return sb.toString();
    }
}
