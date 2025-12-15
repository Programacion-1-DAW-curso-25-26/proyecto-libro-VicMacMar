public class ejercicio2 {

    public static int[] imprimirAleatorio(int[] aleatorios){
        for (int i=0; i<=5; i++){
            aleatorios[i] = (int)(Math.random()*5);
        }
        return aleatorios;
    }

    public static void rellenar(int[] aleatorio){
        for(int i=0; i<= aleatorio.length; i++){
            aleatorio[i]=(int)(Math.random()*5);
        }
    }

    public static void main(String[] args) {
        int num2 = 5;

        int[] array = new int[10];
        rellenar(array);
        System.out.println(imprimirAleatorio(array));
    }
}
