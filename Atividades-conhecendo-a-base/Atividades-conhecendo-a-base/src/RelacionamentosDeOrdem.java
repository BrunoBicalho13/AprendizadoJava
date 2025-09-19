
import java.util.Scanner;

/*
 * 
 * Escreva um programa que informe os relacionamentos de ordem existentes entre dois números:
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual
 * 
 */


public class RelacionamentosDeOrdem {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Os números são iguais = " + (num1 == num2));
        System.out.println("Os números são não iguais = " + (num1 != num2));
        System.out.println("O primeiro número é maior = " + (num1 > num2));
        System.out.println("O primeiro número é menor = " + (num1 < num2));
        System.out.println("O primeiro número é maior ou igual ao segundo = " + (num1 >= num2));
        System.out.println("O primeiro número é menor ou igual segundo = " + (num1 <= num2));

        sc.close();
    }
}
