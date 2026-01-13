public class MainLibro {
    public static void main(String[] args){

        Libro libro1 = new Libro("Harry Potter", "Alfonso Hueso", 400, 9);
        Libro libro2 = new Libro("La vuelta al mundo", "Joao Felix", 450, 7);

        System.out.println("---------------------");
        libro1.presentacion();
        System.out.println("---------------------");
        libro2.presentacion();
    }
}
