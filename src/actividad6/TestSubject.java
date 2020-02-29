package actividad6;

public class TestSubject {

    public static void main(String[] args) {

        Subject subject = new Subject("Matemáticas",2,3);

        System.out.printf("Nombre asignatura:"+" "+subject.getName()+" "+"Código del curso:"+" "+
                subject.getCodigo()+" "+"Numero del curso:"+" "+subject.getCurso());
    }




}
