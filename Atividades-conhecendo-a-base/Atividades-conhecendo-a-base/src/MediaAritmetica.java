
import java.util.Scanner;

/*
 * 
 * Exercício 1: Dadas 3 notas, imprimir a média aritmética do aluno
 * 
 * 1. Ler 3 notas
 * 2. Calcular a média
 * 3. Imprimir resultado
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 */

public class MediaAritmetica {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das notas é: " + media);

        sc.close();
    }
}
