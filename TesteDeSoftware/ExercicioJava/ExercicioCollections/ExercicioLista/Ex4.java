package TesteDeSoftware.ExercicioJava.ExercicioLista;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex4 {
    public static void main(String[] args) {
        // Criando uma LinkedList com os nomes de 5 planetas
        LinkedList<String> planetas = new LinkedList<>();

        // Adicionando 5 planetas à lista
        planetas.add("Mercúrio");
        planetas.add("Vênus");
        planetas.add("Terra");
        planetas.add("Marte");
        planetas.add("Júpiter");

        // Adicionando um planeta no início e outro no final
        planetas.addFirst("Plutão");  // Adiciona no início
        planetas.addLast("Saturno");  // Adiciona no final

        // Exibindo a lista completa
        System.out.println("Lista completa de planetas: " + planetas);

        // Percorrendo a lista em ordem inversa
        System.out.println("Lista em ordem inversa:");
        ListIterator<String> iterator = planetas.listIterator(planetas.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
