package polimorfismo;

public class Cozinheiro implements Trabalhador{
    
    public void trabalhar() {
        System.out.println("Fazer comida.");
    }

    public void temperarComida(){
        System.out.println("Temperar comida.");
    }

    
    public String toString() {
        return "Cozinheiro";
    }

    
}
