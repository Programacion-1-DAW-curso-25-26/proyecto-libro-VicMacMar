public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private int valoracion;

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

    public void presentacion(){
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El libro "+titulo+" tiene de autor a "+autor);
        System.out.println("La valoracion del libro sobre 10 es: "+valoracion);
        System.out.println("El numero de paginas que tiene el libro es "+numPaginas);
    }
}
