package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Ex12 {
    public static void main(String[] args) {
        // Criando um TreeMap para armazenar frutas e suas calorias
        Map<String, Integer> frutas = new TreeMap<>();

        // Adicionando algumas frutas e suas calorias
        frutas.put("Maçã", 52);
        frutas.put("Banana", 89);
        frutas.put("Laranja", 47);
        frutas.put("Morango", 32);
        frutas.put("Abacaxi", 50);

        // Criando um TreeMap com base nas calorias das frutas
        TreeMap<String, Integer> frutasOrdenadas = new TreeMap<>(
            Comparator.comparingInt(frutas::get)
        );

        // Adicionando as frutas ao TreeMap ordenado
        frutasOrdenadas.putAll(frutas);

        // Imprimindo as frutas ordenadas por calorias
        System.out.println("Frutas ordenadas por calorias:");
        for (Map.Entry<String, Integer> entrada : frutasOrdenadas.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " calorias");
        }
    }

}
