import java.util.Scanner;

public class evaluables3 {

    public static void main(String[] args) {

        Scanner pre1 = new Scanner(System.in);

        System.out.println("Cuantos numeros vas a introducir?");
        int numeros = pre1.nextInt();
        int[] arrayNumeros = new int[numeros];

        System.out.println("Introduce los numeros: ");
        for(int i=0; i<numeros; i++){
            System.out.print("Numero: "+(i+1)+": ");
            int introducirNumeros = pre1.nextInt();
            arrayNumeros[i] = introducirNumeros;
        }

        int[] primos = filtraPrimos(arrayNumeros);

        System.out.println("\nEste es el array de numeros primos");
        for(int i=0; i<primos.length; i++){
            System.out.println("El numero: "+primos[i]+" es primo");
        }

    }

    /*
    Devuelve un array con todos los números primos que se encuentren en otro array
    que se pasa como parámetro. Obviamente el tamaño del array que se devuelve será
    menor o igual al que se pasa como parámetro.
    */
    public static int[] filtraPrimos(int arrayNumeros[]){
        int longitud = 0;
        int inicial = 0;
        for(int i=arrayNumeros[inicial]-1; i>1; i--){
            if(arrayNumeros[i] % i == 0){
                System.out.println("Este numero es primo "+arrayNumeros[i]);
                longitud++;
            }
        }
        int[] numerosPrimos = new int[longitud];
        for(int i=0; i<longitud; i++){
            if(arrayNumeros[i] % i == 0){
                System.out.println("Voy a almacenar este numero "+arrayNumeros[i]);
                numerosPrimos[i] = arrayNumeros[i];
            }
        }

        return numerosPrimos;
    }

}
