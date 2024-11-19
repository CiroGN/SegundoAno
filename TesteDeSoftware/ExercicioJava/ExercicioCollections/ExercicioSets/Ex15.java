package TesteDeSoftware.ExercicioJava.ExercicioSets;

import java.util.HashSet;

public class Ex15 {
    public static void main(String[] args) {
        // Criando um HashSet para armazenar números inteiros
        HashSet<Integer> numeros = new HashSet<>();

        // Adicionando 10 números ao HashSet (incluindo duplicados)
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(10); // Duplicado
        numeros.add(30);
        numeros.add(5);  // Duplicado
        numeros.add(35);
        numeros.add(40);
        numeros.add(20); // Duplicado

        // Exibindo o conteúdo do HashSet
        System.out.println("Conteúdo do HashSet (elementos duplicados são ignorados):");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
