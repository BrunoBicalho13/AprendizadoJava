
import java.util.Scanner;

/*
 * 
 * Crie uma calculadora de IMC que mostra em que classificação a pessoa está:
 * 
 * menor que 18,5 -> Magreza
 * entre 18,5 e 24,9 -> Normal
 * entre 25 e 29,9 -> Sobrepeso
 * entre 30 e 39,9 -> Obesidade
 * maior que 40 -> Obesidade Grave
 * 
 */





public class CalculadoraIMC {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Peso e sua altura, nessa ordem: ");
        
        double peso = sc.nextDouble();
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);

        if(IMC < 18.5){
            System.out.println("Magreza");
        }else if( IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Normal");
        }else if(IMC >= 25 && IMC <= 29.9){
            System.out.println("Sobrepeso");
        }else if(IMC >= 30 && IMC <= 39.9){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade Grave");
        }
        sc.close();
    }
}
