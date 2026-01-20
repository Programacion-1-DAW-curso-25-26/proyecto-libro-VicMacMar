public class Main {
    public static void main(String[] args){

        Libro libro1 = new Libro("Harry Potter", "Alfonso Hueso", 400, 9, 001);
        Libro libro2 = new Libro("La vuelta al mundo", "Joao Felix", 450, 7, 001);

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
        System.out.println(libro1);
    }
}