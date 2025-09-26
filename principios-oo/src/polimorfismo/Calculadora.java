package polimorfismo;

public class Calculadora{
    public static void main(String[] args) {
       System.out.println(soma(1, 1));
       System.out.println(soma(2.0, 2));
    }

    static int soma(int a, int b){
        return a + b;
    }

    static double soma(double a, double b){
        return a + b;
    }
}
