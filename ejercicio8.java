import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio8 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Negro");
        colores.add("Blanco");
        colores.add("Amarillo");

        Iterator it = colores.iterator();
        while(it.hasNext()){
            String color = it.next().toString();
            if (color.equalsIgnoreCase("Blanco")){
                colores.remove(color);
            }
        }

        for (String color : colores){
            System.out.println(color);
        }
    }
}
