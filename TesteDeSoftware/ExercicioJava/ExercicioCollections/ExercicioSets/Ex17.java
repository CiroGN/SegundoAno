package TesteDeSoftware.ExercicioJava.ExercicioSets;

import java.util.LinkedHashSet;

public class Ex17 {
    public static void main(String[] args) {
        // Criando um LinkedHashSet para armazenar cores
        LinkedHashSet<String> cores = new LinkedHashSet<>();

        // Adicionando 6 cores diferentes ao LinkedHashSet
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Amarelo");
        cores.add("Laranja");
        cores.add("Roxo");

        // Adicionando uma cor duplicada
        cores.add("Verde"); // Duplicata

        // Imprimindo o conjunto de cores
        System.out.println("Conjunto de cores (ordem de inserção preservada, duplicatas ignoradas):");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
