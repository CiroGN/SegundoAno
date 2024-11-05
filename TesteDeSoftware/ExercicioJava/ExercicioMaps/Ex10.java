package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex10 {
    public static void main(String[] args) {
        // Criando um LinkedHashMap para associar meses do ano aos seus nomes
        LinkedHashMap<Integer, String> meses = new LinkedHashMap<>();

        // Adicionando os meses do ano ao LinkedHashMap
        meses.put(1, "Janeiro");
        meses.put(2, "Fevereiro");
        meses.put(3, "Março");
        meses.put(4, "Abril");
        meses.put(5, "Maio");
        meses.put(6, "Junho");
        meses.put(7, "Julho");
        meses.put(8, "Agosto");
        meses.put(9, "Setembro");
        meses.put(10, "Outubro");
        meses.put(11, "Novembro");
        meses.put(12, "Dezembro");

        // Exibindo os meses em ordem de inserção
        System.out.println("Meses do ano:");
        for (Map.Entry<Integer, String> entry : meses.entrySet()) {
            System.out.println("Mês " + entry.getKey() + ": " + entry.getValue());
        }

        // Removendo todos os meses com número par
        meses.values().removeIf(mes -> meses.entrySet().stream()
                .filter(entry -> entry.getValue().equals(mes))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0) % 2 == 0);

        // Exibindo os meses restantes após a remoção
        System.out.println("\nMeses restantes após a remoção dos meses pares:");
        for (Map.Entry<Integer, String> entry : meses.entrySet()) {
            System.out.println("Mês " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
