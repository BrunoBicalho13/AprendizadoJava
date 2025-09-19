package EstudoOperadores;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 2;

        int soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);

        int numero3 = 3;
        int numero4 = 4;
        
        int subtracao = numero3 - numero4;
        System.out.println("A subtração é: "+ subtracao);

        double numero5 = 5.23;
        double numero6 = 6.9;

        double multiplicacao = numero5 * numero6;
        System.out.println("A multiplicação é: " + multiplicacao);

        double numero7 = 7;
        double numero70 = 70;

        double divisão = numero7 / numero70;
        System.out.println("A divisão é: " + divisão);

        int modulo = numero3 % numero4;
        System.out.println("O modulo é: " + modulo);

        int contador = 0;
        contador++;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
    
    
        double decimal = 1.0;
        double decimal2 = 2.0;
        
        boolean ehMaior = decimal>decimal2;
        System.out.println(ehMaior);

        boolean ehMenor = decimal< decimal2;
        System.out.println(ehMenor);

        System.out.println(decimal >= decimal2);
        System.out.println(decimal <= decimal2);
        System.out.println(decimal == decimal2);
        System.out.println(decimal != decimal2);
        

        int var = 1;
        var += 3;
        var -= 2;
        var *= 12;
        var /= 4;
        var %= 3;
        System.out.println(var);
        
        int valor1 = 4;
        int valor2 = 2;

        boolean expressao = valor1 < 10 && valor2 < 10;
        System.out.println(expressao);

        boolean expressao2 = valor1 < 10 || valor2 < 10;
        System.out.println(expressao2);

        System.out.println(!(2 < 1));
    }
}
