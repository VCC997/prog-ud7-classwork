package actividad6;

public class Subject {

    private String name;
    private int codigo;
    private int curso;

    public Subject(String name, int codigo, int curso){
        this.name=name;
        this.codigo=codigo;
        this.curso=curso;
    }
    public String getName() {
        return name;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }
}
