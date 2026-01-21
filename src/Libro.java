import java.util.Objects;

public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private int valoracion;
    private int isbn;

    public Libro(String titulo, String autor, int numPaginas, int valoracion, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void presentacion(){
        System.out.println("\nEl titulo del libro es: "+titulo);
        System.out.println("El libro "+titulo+" tiene de autor a "+autor);
        System.out.println("La valoracion del libro sobre 10 es: "+valoracion);
        System.out.println("El numero de paginas que tiene el libro es "+numPaginas);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", valoracion=" + valoracion +
                '}';
    }
}