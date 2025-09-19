/*
 * 
 * Crie um programa que leia um nome e imprima uma saudação utilizando o Console ao invés do Scanner
 * 
 */
 import java.io.Console;

public class SaudacaoConsole {
    public static void main(String[] args) {
        Console console = System.console();

        String nome = console.readLine("Digite o seu nome: ");
        System.out.println("Olá, " + nome);
    }
}
