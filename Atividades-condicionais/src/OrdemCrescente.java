
import java.util.Scanner;

/*
 * 
 * Leia 3 números e imprima-os em ordem crescente
 * 
 */


public class OrdemCrescente {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 > num3){
            System.out.println(num1);
            if(num2 < num3){
                System.out.println(num2);
                System.out.println(num3);
            }else{
                System.out.println(num3);
                System.out.println(num2);
            }
        }else if (num2 < num1 && num2 < num3) {
             System.out.println(num2);
             if(num1 < num3){
                System.out.println(num1);
                System.out.println(num3);
            }else{
                System.out.println(num3);
                System.out.println(num1);
            }
        }else{
            System.out.println(num3);
            if(num1 < num2){
                System.out.println(num1);
                System.out.println(num2);
            }else{
                System.out.println(num2);
                System.out.println(num1);
            }
        }
        sc.close();
    }
}
