
import java.util.Scanner;

/*
 * 
 * Crie uma calculadora que dados 2 numeros e uma operação, retorna o resultado
 * 
 * 
 */

public class Calculadora {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite dois números");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Digite qual operação gostaria de realizar(+,-,*,/)");
        String operacao = sc.next();

       switch(operacao){
        case "+" -> System.out.println(num1 + num2);
        case "-" -> System.out.println(num1 - num2);
        case "*" -> System.out.println(num1 * num2);
        case "/" -> System.out.println(num1 / num2);
        default -> System.out.println("Operador inválido");
       }
       sc.close();
        }
    }

