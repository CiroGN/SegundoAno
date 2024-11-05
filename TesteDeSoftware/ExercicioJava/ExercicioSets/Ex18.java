package TesteDeSoftware.ExercicioJava.ExercicioSets;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        // Criando um LinkedHashSet para armazenar palavras
        LinkedHashSet<String> palavras = new LinkedHashSet<>();

        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando uma frase ao usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Dividindo a frase em palavras e adicionando ao LinkedHashSet
        String[] palavrasArray = frase.split(" ");
        for (String palavra : palavrasArray) {
            palavras.add(palavra); // Adiciona cada palavra ao conjunto
        }

        // Exibindo a frase sem palavras duplicadas
        System.out.println("\nFrase sem palavras duplicadas:");
        for (String palavra : palavras) {
            System.out.print(palavra + " ");
        }

        // Fechando o scanner
        scanner.close();
    }
}
