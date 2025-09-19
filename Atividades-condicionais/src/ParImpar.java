
import java.util.Scanner;

/*
 * 
 * Leia um número e imprima se ele é par ou impar
 * 
 * 
 */


public class ParImpar {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Digite um número: ");

        int num = sc.nextInt();

        if(num % 2 ==0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
        sc.close();
    }
}

