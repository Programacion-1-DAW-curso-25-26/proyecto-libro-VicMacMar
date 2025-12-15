import java.util.ArrayList;
import java.util.Scanner;

public class estructurasDatos {

    public static void main(String[] args) {
        Scanner pre1 = new Scanner(System.in);
        // Declaración correcta usando el Wrapper Integer
        ArrayList<Integer> numeros = new ArrayList<>();

        // AUTOBOXING: El compilador convierte el primitivo 10 a new Integer(10)
        numeros.add(10);
        numeros.add(20);
        numeros.remove(1);
        numeros.add(30);
        numeros.add(15);

        for(int numero : numeros){
            System.out.println("Hola soy una vuelta");
            System.out.println(numero);
        }

        //Traer la funcion de una clas ene le mismo proyecto
        int pideNum = ejercicio7.leerNumero(pre1);
        System.out.println("Numero recueperado de la funcion de otra clase "+pideNum);

        // UNBOXING: El compilador extrae el int del objeto Integer automáticamente
        Integer valor = numeros.size();

        System.out.println("Valor recuperado: " + valor);


    }
}
