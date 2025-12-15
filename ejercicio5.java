import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner pre1 = new Scanner(System.in);
        double tarifaBase = 5;

        presentacion();
        double peso = solicitarPeso(pre1);
        int destino = solicitarDestino(pre1);
        double suplPeso = suplementoPeso(tarifaBase);
        double suplDes = suplementoDestino(destino);
        double preFinal = precioFinal(tarifaBase, suplPeso, suplDes);
        informeFinal(tarifaBase, peso, destino, suplPeso, suplDes, preFinal);
    }

    public static void presentacion(){
        System.out.println("--- Programa para calcular el precio de envio ---");
    }

    public static double solicitarPeso(Scanner pre2){
        System.out.println("Introduce el peso");
        double peso = pre2.nextInt();


        return peso;
    }

    public static int solicitarDestino(Scanner pre2){
        System.out.println("""
                Introduce el destino
                1. Dale al 1 para nacional
                2. Dale al 2 para europa
                3. Dale al 3 para internacional
                """);
        int destino = pre2.nextInt();

        return destino;
    }

    public static double suplementoPeso(double peso){
        double sp;
        if (peso <= 2) {
            sp = 0.0;
        }else if (peso > 2 && peso <= 5) {
            sp = 3.0;
        }else{
            sp = 5.0;
        }

        return sp;
    }

    public static double suplementoDestino(int destino) {
        double sd = 0;
        switch (destino){
            case 1:
                sd = 0.0;
                break;
            case 2:
                sd = 7.0;
                break;
            case 3:
                sd = 15.0;
                break;
        }
        return sd;
    }

    public static double precioFinal(double tarifaBase, double suplPeso, double suplDes) {
        return tarifaBase + suplPeso + suplDes;
    }

    public static void informeFinal(double tarifaBase, double peso, int destino, double suplPeso, double suplDes, double preFinal){
        System.out.println("El precio base es de "+tarifaBase);
        System.out.println("El peso es de "+peso);
        System.out.println("El destino es de "+destino);
        System.out.println("El suplemento del peso es de "+suplPeso);
        System.out.println("El suplemento del destino es de "+suplDes);
        System.out.println("Por ulimo el precio final es de "+preFinal);
    }
}
