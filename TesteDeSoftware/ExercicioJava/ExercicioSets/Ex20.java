package TesteDeSoftware.ExercicioJava.ExercicioSets;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex20 {
    public static void main(String[] args) {
        // Criando um TreeSet para armazenar nomes de cidades
        TreeSet<String> cidades = new TreeSet<>();

        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Permitindo que o usuário insira 5 nomes de cidades
        System.out.println("Insira 5 nomes de cidades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Cidade " + (i + 1) + ": ");
            String cidade = scanner.nextLine();
            cidades.add(cidade); // Adiciona a cidade ao TreeSet
        }

        // Exibindo a lista de cidades ordenada em ordem alfabética
        System.out.println("\nLista de cidades em ordem alfabética:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        // Fechando o scanner
        scanner.close();
    }
}
