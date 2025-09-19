
import java.util.Scanner;

/*
 * 
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não. Media >= a 7.0
 * 
 */

public class AprovadoReprovado {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7.0){
            System.out.println("O aluno está aprovado!");
        }else{
            System.out.println("O aluno está reprovado!");
        }
        sc.close();
    }
}
