
import java.util.Scanner;

/*
 * 
 * Imprimir a tabuada de um número
 * 1. Ler um número
 * 2. Imprimir sua Tabuada
 * 
 */

public class Tabuada {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
        sc.close();
    }
}
