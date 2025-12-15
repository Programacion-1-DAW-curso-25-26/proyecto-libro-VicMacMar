import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        int n;
        int cantidad = 0;
        Scanner pre1 = new Scanner(System.in);

        System.out.println("Introduce numeros enteros positivos y 0 para terminar");
        System.out.print("numero: ");
        n = pre1.nextInt();

    }

    public static int leerNumero(Scanner pre1){
        System.out.print("numero: ");
        int n = pre1.nextInt();
        return n;
    }

    public static int[] rellenarArray(int[] numeros, int n, int cantidad, Scanner pre1){
        while (n != 0) {
            if (n < 0) {
                System.out.println("No se permiten negativos. Se ignora.");
            } else {
                numeros[cantidad] = n;
                cantidad++;
            }
            n = leerNumero(pre1);
        }
        return numeros;
    }

    public static void calcularValores(int[] numeros, int cantidad){
        if (cantidad == 0) {
            System.out.println("No se introdujeron números válidos.");
        } else {
            int suma = 0;
            int max = numeros[0];
            int min = numeros[0];
            int pares = 0;

            for (int i=0; i<cantidad; i++) {
                int valor = numeros[i];
                suma += valor;

                if (valor > max) max = valor;
                if (valor < min) min = valor;

                if (valor % 2 == 0){
                    pares++;
                }
        }

            double media = (double) suma / cantidad;
            double porcentajePares = (pares * 100.0) / cantidad;
        }
    }

    public static void mostrarResultados(int cantidad, int suma, int max, int min, double media, double porcentajePares){
        System.out.println("Numeros suma: " + suma);
        System.out.println("Numeros max: " + max+min+media+porcentajePares);

    }

}
