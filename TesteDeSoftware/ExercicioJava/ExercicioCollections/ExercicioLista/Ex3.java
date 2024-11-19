package TesteDeSoftware.ExercicioJava.ExercicioLista;

import java.util.LinkedList;

public class Ex3 {
     public static void main(String[] args) {
        // Criando uma LinkedList de caracteres
        LinkedList<Character> letras = new LinkedList<>();

        // Adicionando as letras de A a Z à lista
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            letras.add(letra);
        }

        System.out.println("Lista completa de letras: " + letras);

        // Removendo os primeiros 5 elementos
        for (int i = 0; i < 5; i++) {
            letras.removeFirst();
        }

        // Exibindo o conteúdo restante da lista
        System.out.println("Lista após remover os primeiros 5 elementos: " + letras);
    }
}
