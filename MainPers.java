import java.util.Scanner;

public class MainPers{
    public static void main(String[] args) {

        Scanner pre1 = new Scanner(System.in);
        Personaje heroe = new Personaje();
        Personaje malo = new Personaje();

        heroe.setNombre("Superman");
        heroe.setNivel(0);
        heroe.setVida(100);
        heroe.saludar();
        heroe.recibirDano(20);
        heroe.saludar();
        malo.setNombre("Capitan America");
        malo.saludar();
        malo.setNombre(pre1.nextLine());
        malo.saludar();
    }
}
