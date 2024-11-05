package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex9 {
     public static void main(String[] args) {
        // Criando um LinkedHashMap para armazenar continentes e a quantidade de países
        LinkedHashMap<String, Integer> continentes = new LinkedHashMap<>();

        // Adicionando continentes e suas respectivas quantidades de países
        continentes.put("África", 54);
        continentes.put("Ásia", 49);
        continentes.put("Europa", 44);
        continentes.put("América do Norte", 23);
        continentes.put("América do Sul", 12);
        continentes.put("Oceania", 14);
        continentes.put("Antártida", 0);

        // Exibindo os continentes em ordem de inserção
        System.out.println("Continentes e a quantidade de países:");
        for (Map.Entry<String, Integer> entry : continentes.entrySet()) {
            System.out.println("Continente: " + entry.getKey() + " | Países: " + entry.getValue());
        }

        // Atualizando a quantidade de países para um dos continentes (exemplo: Europa)
        continentes.put("Europa", 45);  // Atualizando para 45 países

        // Exibindo os continentes após a atualização
        System.out.println("\nContinentes após a atualização:");
        for (Map.Entry<String, Integer> entry : continentes.entrySet()) {
            System.out.println("Continente: " + entry.getKey() + " | Países: " + entry.getValue());
        }
    }
}
