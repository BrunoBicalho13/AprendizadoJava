
import java.util.Scanner;

/*
 * 
 * Dada uma figura geométrica ( retângulo, triângulo, círculo), a saída deve ser a área
 * 
 */


public class AreaFigura {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a figura geometrica: ");
        String figuraGeometrica = sc.next();

        switch(figuraGeometrica){
            case "retangulo" ->{
                System.out.println("Digite o tamanho da base e da altura: ");
                double base = sc.nextDouble();
                double altura = sc.nextDouble();

                double area = base * altura;

                System.out.println(area);
            }
            case "triangulo" -> {
                System.out.println("Digite o tamanho da base e da altura: ");
                double base = sc.nextDouble();
                double altura = sc.nextDouble();

                double area = (base * altura) / 2;

                System.out.println(area);

            }
            case "circulo" -> {
                System.out.println("Digite o valor do raio: ");

                double raio = sc.nextDouble();

                double area = 3.14 * (raio * raio);

                System.out.println(area);
            }
            default -> System.out.println("Figura inválida");
        }
        sc.close();
    }
}