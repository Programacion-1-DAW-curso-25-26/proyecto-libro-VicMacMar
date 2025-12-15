import java.util.Scanner;

public class evaluables1 {

    public static void main(String[] args) {

        Scanner pre1 = new Scanner(System.in);

        System.out.println("¿Quieres calcular el area(a) o el volumen(v)?");
        char calcular = pre1.next().toLowerCase().charAt(0);

        System.out.println("Ahora introduce el radio y la altura.");
        System.out.print("Radio: ");
        double radio = pre1.nextDouble();
        System.out.print("Altura: ");
        double altura = pre1.nextDouble();

        calcularAreaVolumen(calcular, radio, altura);
    }

    public static void calcularAreaVolumen(char calcular, double radio, double altura){

        double resultado = 0;
        if (calcular == 'a'){
            resultado = 2*Math.PI*radio*(radio+altura);
        }else if (calcular == 'v'){
            resultado = Math.PI*(radio*radio)*altura;
        }

        System.out.println("Este es el resultado " + resultado);
    }

}
