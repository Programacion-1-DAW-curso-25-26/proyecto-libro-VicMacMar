import java.util.Scanner;

public class examen {
    public static void main(String[] args) {

        Scanner pre1 = new Scanner(System.in);
        int[] numeros = new int[0];

        System.out.println("Introduce numeros: ");
        for (int  i=0; i<5; i++){
            numeros[i] = pre1.nextInt();
        }
    }
}
