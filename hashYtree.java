import java.util.*;

public class hashYtree {
    public static void main(String[] args) {
        Scanner pre1 = new Scanner(System.in);
        LinkedHashSet<String> especies = new LinkedHashSet<>();
        Integer[] auxiliar = {101, 102, 103, 101, 104, 102, 105};
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(auxiliar));
        HashSet<Integer> numerosNoRepetidos = new HashSet<>(numeros);
        //HashSet<String> especies = new HashSet<>();
        //TreeSet<String> especies = new TreeHashSet<>();

        especies.add("Leon");
        especies.add("Tigre");
        especies.add("Cebra");
        especies.add("Leon");
        especies.add("Elefante");
        especies.add("Tigre");

        System.out.println("El conjunto tiene "+especies.size()+" elementos");

        System.out.println("Estos son los animales que hay:");
        for(String nombres : especies){
            System.out.println(nombres);
        }

        System.out.println("Que animal qieres eliminar?");
        String animal = pre1.nextLine();

        if(especies.contains(animal)){
            especies.remove(animal);
        }

        System.out.println("Lista de animales finales");
        for(String nombres : especies){
            System.out.println(nombres);
        }
    }
}
