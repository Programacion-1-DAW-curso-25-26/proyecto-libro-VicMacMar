import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class primoYcapicua {
    public static void main(String[] args) {
        Scanner pre1 = new Scanner(System.in);
        ArrayList<String> listaNombres = new ArrayList<>();
        int opcion = 0;
        String nombre;

        do{
            imprimirMenu();
            opcion = pre1.nextInt();
            pre1.nextLine();
            switch (opcion){
                case 1:
                    String agenda = anadirNombres(pre1, listaNombres);
                    listaNombres.add(agenda);
                    break;
                case 2:
                    for(String agendaFinal : listaNombres){
                        System.out.println(agendaFinal);
                    }
                    break;
                case 3:
                    String agendaNueva = modificarNombres(pre1, listaNombres);
                    listaNombres.add(agendaNueva);
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(opcion != 0);

    }

    public static void imprimirMenu(){
        System.out.println("""
                --- Agenda de contacto ---
                1. Añadir contacto
                2. Mostrar agenda
                3. Actualizar contacto
                4. Eliminar contacto
                5. Salir
                Elige una opcion
                """);
    }

    public static int buscarContacto(String nombre, ArrayList<String> listaNombres){
        int indice = 0;
        for(int i=0; i<listaNombres.size(); i++){
            if(nombre.equals(listaNombres.get(i))){
                indice = i;
            }
        }
        return indice;
    }

    public static String anadirNombres(Scanner pre2, ArrayList<String> lista){
        System.out.println("Introduce el nombre");
        String persona = pre2.nextLine();
        System.out.println("Introduce el telefono");
        String telefono = pre2.nextLine();
        String agenda = persona+", "+telefono;

        return agenda;
    }

    public static String modificarNombres(Scanner pre2, ArrayList<String> lista){
        System.out.println("Introduce el nombre de quien quieras modificar los datos");
        String nombre = pre2.nextLine();
        int numero = buscarContacto(nombre, lista);
        lista.remove(numero);

        System.out.println("Introduce el nuevo nombre");
        String persona = pre2.nextLine();

        System.out.println("Introduce el nuevo telefono");
        String telefono = pre2.nextLine();

        String agendaNueva = persona+", "+telefono;

        return agendaNueva;
    }

    public static ArrayList<String> eliminarNombres(Scanner pre2, ArrayList<String> lista){
        System.out.println("Dime el nombre de quien quieras eliminar");
        String nombre = pre2.nextLine();
        Iterator iterador = lista.iterator();
        while(iterador.hasNext()){
            String contacto = iterador.next().toString();
            //El split es para separar lo que se guarda en los csv por ejemplo victor;macian;martinez
            //Lo que hace es cortarlos por donde pone ; y en la posicion cero estara victor
            String nombreLeido = contacto.split(";")[0];
            if(nombre.equalsIgnoreCase(nombreLeido)){
                iterador.remove();
            }
        }
        return lista;
    }
}
