public class Libro {

    public String titulo;
    public String autor;
    public int numPaginas;
    public int valoracion;

    public void presentacion(){
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El libro "+titulo+" tiene de autor a "+autor);
        System.out.println("La valoracion del libro sobre 10 es: "+valoracion);
        System.out.println("El numero de paginas que tiene el libro es "+numPaginas);
    }
}
