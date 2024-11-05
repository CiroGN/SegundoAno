package TesteDeSoftware.ExercicioJava.ExercicioLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex1 {
     public static void main(String[] args) {
        // Criando uma lista de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Inserindo 10 números aleatórios entre 1 e 100 na lista
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;
            numeros.add(numeroAleatorio);
        }

        System.out.println("Lista antes de ordenar: " + numeros);

        // Ordenando a lista em ordem crescente
        Collections.sort(numeros);

        // Imprimindo a lista ordenada
        System.out.println("Lista ordenada em ordem crescente: " + numeros);
    }
}
