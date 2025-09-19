
import java.util.Scanner;

/*
 * 
 * Faça um programa que converta um valor em dólar em reais
 * 
 * Ex: Dólares: 100, Cotação 4,92 => O valor em reais é R$ 492,00
 */

public class ConversorDolarReal {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em Dólares: ");
        double valorDolar = sc.nextDouble();

        System.out.println("Digite o valor da Cotação: ");
        double cotacao = sc.nextDouble();

        double valorReais = valorDolar * cotacao;

        System.out.println("O valor em reais é: " + valorReais);

        sc.close();
    }
}
