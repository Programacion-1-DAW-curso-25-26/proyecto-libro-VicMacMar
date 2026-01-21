import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner pre1 = new Scanner(System.in);
        int opcion = 0;

        ArrayList<Libro> biblioteca = new ArrayList<>();

        do {
            imprimirMenu();
            opcion = pre1.nextInt();
            pre1.nextLine();

            switch(opcion){
                case 1:
                    anyadirLibro(biblioteca, pre1);
                    break;
                case 2:
                    mostrarLibros(biblioteca, pre1);
                    break;
                case 3:
                    buscarLibro(pre1, biblioteca);
                    break;
                case 4:
                    eliminarLibro(biblioteca, pre1);
                    break;
                case 5:
                    vaciarLista(biblioteca);
                    break;
                case 6:
                    System.out.println("Vas a salir del programa");
                    break;
                default:
                    System.out.println("Introduce una opcion valida");
                    break;
            }
        }while(opcion != 6);

        /*biblioteca.add(libro1);
        biblioteca.add(libro2);

        System.out.println(biblioteca.contains(libro1));

        for(Libro l: biblioteca){
            System.out.println(l);
        }

        System.out.println("---------------------");
        libro1.presentacion();
        System.out.println("---------------------");
        libro2.presentacion();
        System.out.println("---------------------");
        if(libro2.equals(libro1)){
            System.out.println("Los libros son iguales");
        }else{
            System.out.println("Los libros son diferentes");
        }
        System.out.println(libro1);*/
    }

    private static void imprimirMenu(){
        System.out.println("""
                1. Añadir libro.
                2. Mostrar todos.
                3. Buscar por ISBN.
                4. Eliminar por ISBN.
                5. Vaciar lista.
                6. Salir.
                """);
    }

    private static void anyadirLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        String nombre;
        String autor;
        int numPaginas;
        int valoracion;
        int isbn;
        System.out.println("Dime el nombre");
        nombre = sc.nextLine();
        System.out.println("Dime el autor");
        autor = sc.nextLine();
        System.out.println("Dime el número de páginas");
        numPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime la valoración");
        valoracion = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el ISBN");
        isbn = sc.nextInt();
        sc.nextLine();
        Libro nuevo = new Libro(nombre, autor, numPaginas, valoracion, isbn);
        biblioteca.add(nuevo);
    }

    private static void mostrarLibros(ArrayList<Libro> biblioteca, Scanner pre1){
        for(int i=0; i<biblioteca.size();i++){
            biblioteca.get(i).presentacion();
        }
    }

    private static void buscarLibro(Scanner pre1, ArrayList<Libro> biblioteca){
        System.out.println("Introduce un Isbn para buscar un libro");
        int buscaIsbn = pre1.nextInt();
        pre1.nextLine();
        for(Libro libro: biblioteca){
            if (libro.getIsbn() == buscaIsbn) {
                System.out.println(libro);
            }else{
                System.out.println("Libro no encontrado");
            }
            System.out.println();
        }
    }

    private static void eliminarLibro(ArrayList<Libro> biblioteca, Scanner pre1){
        System.out.println("Introduce un Isbn para buscar un libro");
        int buscaIsbn = pre1.nextInt();
        pre1.nextLine();
        Iterator<Libro> it = biblioteca.iterator();
        while(it.hasNext()){
            Libro l = it.next();
            if(l.getIsbn() == buscaIsbn){
                it.remove();
            }
        }
    }

    private static void vaciarLista(ArrayList<Libro> biblioteca){
        int numLibros = biblioteca.size();
        biblioteca.clear();
        System.out.println("Has eliminado "+numLibros+" libros");
    }
}