package actividad13;

public class Libro {

    private String titulo;

    private String autor;

    private int libros;

    private int librosPrestados;

    Libro(String tittle, String author){
        this.titulo=tittle;
        this.autor=author;
        this.libros=10;
        this.librosPrestados=0;
    }

    private boolean loaned(String tittle, String author, int books, int lendBooks){

        boolean prestados = true;
        if (lendBooks < books){
            prestados = false;
        }else{
            prestados = true;
        }
        return prestados;
    }

    private boolean returned(String tittle, String author, int books, int lendBooks){

        boolean devueltos = true;
        if (books < lendBooks){
            devueltos = false;
        }else{
            devueltos = true;
        }
        return devueltos;
    }

}
