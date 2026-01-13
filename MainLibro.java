public class MainLibro {
    public static void main(String[] args){

        Libro libro1 = new Libro();

        libro1.setTitulo("Harry Potter");
        libro1.setAutor("Alfonso Hueso");
        libro1.setNumPaginas(400);
        libro1.setValoracion(9);

        System.out.println("---------------------");
        libro1.presentacion();
    }
}
