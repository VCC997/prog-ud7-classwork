package actividad5;

public class TestCoche {
    public static void main(String[] args) {
        Coche basico= new Coche();
        Coche custom= new Coche("Ferrari","rojo",true,
                "666666",Coche.Tipo.DEPORTIVO,2020, TipoSeguro.TODO_RIESGO);
        basico.mostrarInfo();
        custom.mostrarInfo();
    }
}
