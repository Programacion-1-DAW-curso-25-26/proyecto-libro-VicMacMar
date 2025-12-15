import java.util.ArrayList;
import java.util.Scanner;

public class gestorDeudas {
    public static void main(String[] args) {

        Scanner pre1 = new Scanner(System.in);

        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<Double> deudas = new ArrayList<>();
        char opcion;

        do{
            mostrarMenu();
            System.out.println("\nIntroduce una opcion: ");
            opcion = pre1.nextLine().toUpperCase().charAt(0);

            switch(opcion){
                case 'A':
                    anadirCliente(pre1, clientes, deudas);
                    break;
                case 'E':
                    eliminarCliente(pre1, clientes, deudas);
                    break;
                case 'D':
                    consultarListado(pre1, clientes, deudas);
                    break;
                case 'C':
                    consultarSaldoCli(pre1, clientes, deudas);
                    break;
                case 'M':
                    modificarDeuda(pre1, clientes, deudas);
                    break;
                case 'S':
                    opcion = 'S';
                    break;
            }
        }while(opcion != 'S');

    }

    public static void mostrarMenu(){
        System.out.println("""
                1. Añadir cliente -> A
                2. Eliminar cliente -> E
                3. Consultar listado -> D
                4. Consultar saldo cliente -> C
                5. Modificar deuda -> M
                6. Salir -> S
                """);
    }

    public static void anadirCliente(Scanner pre2, ArrayList<String> funClientes, ArrayList<Double> funDeudas){
        System.out.println("Introduce nombre del nuevo cliente: ");
        String cliente = pre2.nextLine();
        funClientes.add(cliente);
        System.out.println("Introduce deuda del nuevo cliente: ");
        Double deuda = pre2.nextDouble();
        funDeudas.add(deuda);
        pre2.nextLine();
    }

    public static void eliminarCliente(Scanner pre2, ArrayList<String> funClientes, ArrayList<Double> funDeudas){
        System.out.println("A que cliente quieres eliminar: ");
        String eliminar = pre2.nextLine();
        for(String cliente: funClientes){
            if(cliente.equals(eliminar)){
                funClientes.remove(eliminar);
            }else{
                System.out.println("No has introducido un nombre valido");
            }
        }
    }

    public static void consultarListado(Scanner pre2, ArrayList<String> funClientes, ArrayList<Double> funDeudas){
        for(String cliente: funClientes){
            System.out.println(cliente);
            System.out.println(funDeudas);
        }
    }

    public static void consultarSaldoCli(Scanner pre2, ArrayList<String> funClientes, ArrayList<Double> funDeudas){

    }

    public static void modificarDeuda(Scanner pre2, ArrayList<String> funClientes, ArrayList<Double> funDeudas){

    }
}
