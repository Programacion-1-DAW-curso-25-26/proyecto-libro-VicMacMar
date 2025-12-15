import java.util.Scanner;

public class evaluavles2 {
    public static void main(String[] args) {
        Scanner pre1 = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = pre1.nextInt();
        String numStr = String.valueOf(numero);
        int longitud = numStr.length();

        int inicial = 0;
        boolean logica = true;

        for (int i=0; i<longitud/2; i++) {
            if (numStr.charAt(inicial) != numStr.charAt(longitud-1-inicial)) {
                logica = false;
                break;
            }
            inicial++;
        }

        if (logica == true) {
            System.out.println("Coinciden (es capicúa)");
        } else {
            System.out.println("No coinciden (no es capicúa)");
        }
    }
}
