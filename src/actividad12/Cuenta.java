package actividad12;

import actividad11.Persona;

public class Cuenta {

    private Persona cliente;

    private String numCuenta;

    private float tipoInteres;

    private float saldo;

    Cuenta(Persona cliente, String numC){

        this.cliente=cliente;
        this.numCuenta=numC;
        this.saldo=0;
        this.tipoInteres = 0.15f;
    }

    public boolean ingreso(float saldo){

        boolean ingresoCorrecto = true;
        if (saldo < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + saldo;
        }
        return ingresoCorrecto;
    }

    public boolean reintegro(float saldo){

        boolean reintegroCorrecto = true;
        if (saldo < 0) {
            reintegroCorrecto = false;
        } else if (saldo >= saldo) {
            saldo -= saldo;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    private boolean transferencia(Cuenta cuentaATransferir, float money){

        boolean correcto = true;
        if (money < 0) {
            correcto = false;
        } else if (saldo >= money) {
            reintegro(money);
            cuentaATransferir.ingreso(money);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
