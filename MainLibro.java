public class MainLibro {
    public static void main(String[] args){

        Libro libro1 = new Libro();

        libro1.titulo = "Harry Potter";
        libro1.autor = "Alfonso Hueso";
        libro1.numPaginas = 400;
        libro1.valoracion = 9;

        System.out.println("---------------------");
        libro1.presentacion();
    }
}
