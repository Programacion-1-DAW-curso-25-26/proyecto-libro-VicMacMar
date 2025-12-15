import java.util.Enumeration;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner pre1 = new Scanner(System.in);

        int notas[] = recopilar(pre1);
        String[] clasif = clasificar(pre1, notas);
        double media = promediar(notas);
        imprimirResultados(notas, clasif);
    }

    public static int[] recopilar(Scanner pre2){
        System.out.println("Cuantos alumnos quieres: ");
        int numeroNotas = pre2.nextInt();
        int[] notas = new int[numeroNotas];
        for (int i = 0; i < numeroNotas; i++) {
            System.out.println("Dime la nota del alumno");
            notas[i] = pre2.nextInt();
        }
        pre2.close();
        return notas;
    }

    public static double promediar(int[] notas){
        int acu = 0;
        for (int i = 0; i < notas.length; i++) {
            acu += notas[i];
        }
        return acu / notas.length;
    }

    public static String clasificar(int nota){
        String tipoNota;
        if(nota <= 10 && nota >= 0){
            System.out.println("Esa nota no es valida");
            tipoNota = "err";
        }else if(nota >= 9){
            tipoNota = "sob";
        }else if (nota >= 7){
            tipoNota = "not";
        }else if (nota >= 5){
            tipoNota = "apr";
        }else{
            tipoNota = "sus";
        }
        return tipoNota;
    }

    public static String[] clasificar(Scanner pre2, int notas[]){
        String tipoNota[] = new String[notas.length];
        for (int i = 0; i < notas.length; i++) {
            tipoNota[i] = clasificar(notas[i]);
        }

        return tipoNota;
    }

    public static void imprimirResultados(int[] notas, String[] clasificar){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("El alumno "+i+" tiene un "+clasificar[i]+" y de nota un "+notas[i]);
        }
    }
}
