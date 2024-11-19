package TesteDeSoftware.ExercicioJava.ExercicioLista;

import java.util.Vector;

public class Ex5 {
    public static void main(String[] args) {
        // Criando um Vector de números decimais
        Vector<Double> numeros = new Vector<>();

        // Adicionando 5 valores ao Vector e imprimindo o tamanho atual
        double[] valores = {1.5, 2.8, 3.3, 4.7, 5.9};
        for (double valor : valores) {
            numeros.add(valor);
            System.out.println("Valor adicionado: " + valor + " | Tamanho atual do Vector: " + numeros.size());
        }

        // Exibindo o conteúdo completo do Vector
        System.out.println("Conteúdo do Vector: " + numeros);

        // Removendo um dos valores (por exemplo, o terceiro valor)
        numeros.remove(2.8); // Remove o valor na posição 2 (índice 2) ou se inserido um exato valor do vetor, este será removido

        // Exibindo o conteúdo do Vector após a remoção
        System.out.println("Conteúdo do Vector após a remoção: " + numeros);
    }
}
