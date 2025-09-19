
import java.util.Scanner;

/*
 * Escreva um programa que leia uma idade em anos e imprima essa idade em dias.
 * 
 */


public class DiasDeIdade {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade em anos: ");
        int idadeAnos = sc.nextInt();

        int idadeDias = idadeAnos * 365;

        System.out.println("A sua idade em dias é: " + idadeDias);

        sc.close();
    }
}
