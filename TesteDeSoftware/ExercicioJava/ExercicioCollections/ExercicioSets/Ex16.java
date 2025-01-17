package TesteDeSoftware.ExercicioJava.ExercicioSets;

import java.util.HashSet;

public class Ex16 {
    public static void main(String[] args) {
        // Criando um HashSet para armazenar nomes de animais
        HashSet<String> animais = new HashSet<>();

        // Adicionando 5 nomes de animais ao HashSet
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Pássaro");
        animais.add("Peixe");
        animais.add("Coelho");

        // Exibindo o conteúdo do HashSet antes da remoção
        System.out.println("Conjunto de animais antes da remoção:");
        for (String animal : animais) {
            System.out.println(animal);
        }

        // Removendo um animal específico
        String animalRemover = "Gato";
        boolean removido = animais.remove(animalRemover);

        // Verificando se a remoção foi bem-sucedida
        if (removido) {
            System.out.println("\n" + animalRemover + " foi removido com sucesso.");
        } else {
            System.out.println("\n" + animalRemover + " não foi encontrado no conjunto.");
        }

        // Exibindo o conteúdo do HashSet após a remoção
        System.out.println("\nConjunto de animais após a remoção:");
        for (String animal : animais) {
            System.out.println(animal);
        }
    }

}
