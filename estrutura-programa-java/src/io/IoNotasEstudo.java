package io;

import java.util.Scanner;

/*
 * Entrada e saida (I/O) de dados no Java
 * 
 * Entrada de dados: Ler dados digitados pelo usuário
 * Saída de dados: Escrever dados para o usuário
 */
public class IoNotasEstudo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        // Leitura de dados de entrada
        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        scanner.close();

        // Saída de dados
        float qualquerNumero = 3.0f;
        System.out.printf("O número digitado foi %d\n", valorDigitado);
        System.out.printf("O número digitado foi %f", qualquerNumero);

    }
}
