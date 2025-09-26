package polimorfismo;

public class Medico implements Trabalhador{

    public void trabalhar() {
        System.out.println("Tratar pacientes.");
    }
    
    public String toString() {
        return "Médico";
    }
}
