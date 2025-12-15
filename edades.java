import java.util.HashMap;
import java.util.Map;

public class edades {
    public static void main(String[] args) {
        HashMap<String, Double> producto = new HashMap<>();

        producto.put("Manzana", 1.5);
        producto.put("pera", 1.8);
        producto.put("Platano", 2.1);

        int acu = 0;

        for(Map.Entry<String, Double> pareja: producto.entrySet()){
            System.out.println(pareja.getKey());
            System.out.println(" "+pareja.getValue());
            System.out.println("Texto");
        }
    }
}
