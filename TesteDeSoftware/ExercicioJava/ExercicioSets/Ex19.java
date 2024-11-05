package TesteDeSoftware.ExercicioJava.ExercicioSets;

import java.util.Random;
import java.util.TreeSet;

public class Ex19 {
    public static void main(String[] args) {
        // Criando um TreeSet para armazenar números inteiros
        TreeSet<Integer> numeros = new TreeSet<>();

        // Criando um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Adicionando 10 números aleatórios entre 1 e 100 ao TreeSet
        while (numeros.size() < 10) {
            int numeroAleatorio = random.nextInt(100) + 1; // Gera números entre 1 e 100
            numeros.add(numeroAleatorio);
        }

        // Imprimindo o menor e o maior número
        System.out.println("Menor número: " + numeros.first());
        System.out.println("Maior número: " + numeros.last());

        // Imprimindo o conjunto para confirmar a ordenação natural
        System.out.println("\nConjunto de números (ordenado):");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

}
