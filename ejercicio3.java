import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio");
        int radio = sc.nextInt();
        System.out.println("Introduce la altura");
        int altura = sc.nextInt();

        System.out.println(calcularArea(radio, altura));
    }

    public static double calcularArea(double radio, double altura) {
        return 2*Math.PI*radio*(radio+altura);
    }
}
