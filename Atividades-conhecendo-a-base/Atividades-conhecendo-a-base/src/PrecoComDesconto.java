
import java.util.Scanner;


/*
 * 
 * 
 * Imprimir preço de um produto com base no desconto á vista e o valor economizado
 * 
 * 1. Ler preço
 * 2. Ler desconto
 * 3. Imprimir novo preço
 * 
 */


public class PrecoComDesconto {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Preço: ");
        double preco = sc.nextDouble();

        System.out.println("Digite o desconto: ");
        double desconto = sc.nextDouble();

        double valorEconomizado = (preco * desconto) / 100;
        double novoPreco = preco - valorEconomizado;

        System.out.printf("O preço com desconto é %.2f, e o valor economizado foi %.2f",novoPreco,valorEconomizado);
        sc.close();
    }
}
