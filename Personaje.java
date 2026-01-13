public class Personaje {
    //bloque de atributos

    private String nombre;
    private int vida;
    private int nivel;

    //bloque de metodos
    public void saludar(){
        System.out.println("Hola mi nombre es el siguiente: "+nombre+".");
        System.out.println("Tengo "+vida+" puntos de vida.");
        System.out.println("Mi nivel es el "+nivel+".");
    }

    public void sumarVida(){
        vida += 50;
    }

    public void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public int getNivel(){
        return nivel;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return vida;
    }

    public void recibirDano(int dano){
        vida -= dano;

        if(vida <= 0){
            vida = 0;
            System.out.println("Te has muerto "+nombre);
        }else{
            System.out.println("Te han metido "+dano+" de vida");
        }
    }
}
