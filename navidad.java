import java.util.*;

public class navidad {

    //En las siguientes 3 variables uso static para así no tener que estar llamandolas en cada función.
    static Scanner sc = new Scanner(System.in);

    //Registro de poblaciones y tiempos
    static HashMap<String, Integer> mapaTiempos = new HashMap<>();

    //Poblaciones visitadas
    static HashSet<String> visitadas = new HashSet<>();

    public static void main(String[] args) {

        char opcion;

        do {
            mostrarMenu();
            opcion = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            switch (opcion) {
                case 'A':
                    anadirPoblacion();
                    break;
                case 'B':
                    visitarPoblacion();
                    break;
                case 'C':
                    calcularRuta();
                    break;
                case 'D':
                    resumenReparto();
                    break;
                case 'E':
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Error, opción no válida");
            }

        } while (opcion != 'E');
    }

    /**
     * Imprime el menú que se muestra en el do while.
     */
    public static void mostrarMenu() {
        System.out.println("\n--- SANTA MAPS ---");
        System.out.println("\nA) Añadir población");
        System.out.println("B) Visitar población");
        System.out.println("C) Calcular ruta");
        System.out.println("D) Resumen reparto");
        System.out.println("E) Salir");
        System.out.print("\n- Escoge una opción [A-E]: ");
    }

    /**
     * Añade la población y su tiempo de reparto o te da un error si ya existe.
     */
    public static void anadirPoblacion() {
        System.out.println("\n--- AÑADIR POBLACIÓN ---");

        System.out.print("- Indica el nombre de la población: ");
        String nombre = sc.nextLine();

        if (mapaTiempos.containsKey(nombre)) {
            System.out.println("[ERROR] La población ya existe");
            return;
        }

        System.out.print("- Indica el tiempo de reparto (ms): ");
        int tiempo = sc.nextInt();
        sc.nextLine();

        mapaTiempos.put(nombre, tiempo);

        System.out.println("[MENSAJE] Población añadida con éxito");
    }

    /**
     * Añadir a una variable las poblaciones ya visitadas según las añadamos.
     */
    public static void visitarPoblacion() {
        System.out.println("\n--- VISITAR POBLACIÓN ---");

        System.out.print("- Indica la población visitada: ");
        String nombre = sc.nextLine();

        if (!mapaTiempos.containsKey(nombre)) {
            System.out.println("[ERROR] La población no existe en el registro");
            return;
        }

        visitadas.add(nombre);

        System.out.println("[MENSAJE] Población visitada con éxito");
    }

    /**
     * Calcula la ruta de los pueblos visitados.
     */
    public static void calcularRuta() {
        System.out.println("\n--- RUTA DE SANTA ---");

        ArrayList<String> ruta = new ArrayList<>();

        // Añadir solo las no visitadas
        for (String poblacion : mapaTiempos.keySet()) {
            if (!visitadas.contains(poblacion)) {
                ruta.add(poblacion);
            }
        }

        if (ruta.isEmpty()) {
            System.out.println("[MENSAJE] No quedan poblaciones pendientes");
            return;
        }

        //Ordenar por tiempo
        Collections.sort(ruta, (c1, c2) -> mapaTiempos.get(c1) - mapaTiempos.get(c2));

        //Mostrar ruta
        int total = 0;
        for (int i = 0; i < ruta.size(); i++) {
            System.out.print("[" + ruta.get(i) + "]");
            if (i < ruta.size() - 1) System.out.print("->");
            total += mapaTiempos.get(ruta.get(i));
        }

        System.out.println("\n- Tiempo estimado: " + total + " ms");
    }

    /**
     * Hace un resumen del reparto según las poblaciones visitadas y sus tiempos.
     */
    public static void resumenReparto() {
        System.out.println("\n--- RESUMEN REPARTO ---");

        System.out.println("- Poblaciones visitadas:");

        int total = 0;

        for (String p : visitadas) {
            System.out.println("(" + p + ")");
            total += mapaTiempos.get(p);
        }

        System.out.println("\n- Tiempo empleado: " + total + " ms");
    }
}
