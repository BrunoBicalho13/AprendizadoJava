
import java.util.Scanner;

/*
 * 
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a formula: 
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 */

public class EstoqueMedio {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade minima: ");
        int quantidadeMinima = sc.nextInt();

        System.out.println("Digite a quantidade maxima: ");
        int quantidadeMaxima = sc.nextInt();

        double estoqueMedio = (quantidadeMaxima + (double) quantidadeMinima) / 2;

        System.out.println("O estoque médio é: " + estoqueMedio);
        
        sc.close();
    }
}
