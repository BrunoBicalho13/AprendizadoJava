package polimorfismo;

public class Programador extends Empregado implements Trabalhador {
    
    public String nome = "Trabalhador";


    public void trabalhar() {
        System.out.println("Fazer programas de computador.");
    }

    public String toString() {
        return "Programador";
    }
}
