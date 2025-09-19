
import java.util.Scanner;

/*
 * 
 * Checa se o ano é bissexto
 * 
 * 
 */


public class AnoBissexto {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        if(ano % 4 != 0 || (ano % 100 == 0 && ano % 400 != 0)){
            System.out.println("Não é bissexto!");
        }else{
            System.out.println("É bissexto!");
        }
        sc.close();
    }
}
