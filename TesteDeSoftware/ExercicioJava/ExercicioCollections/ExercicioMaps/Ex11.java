package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.Map;
import java.util.TreeMap;

public class Ex11 {
    public static void main(String[] args) {
        // Criando um TreeMap para armazenar cidades e suas populações
        TreeMap<String, Integer> cidades = new TreeMap<>();

        // Adicionando cidades e suas populações ao TreeMap
        cidades.put("São Paulo", 12330000);
        cidades.put("Rio de Janeiro", 6748000);
        cidades.put("Belo Horizonte", 2527000);
        cidades.put("Salvador", 2923000);
        cidades.put("Brasília", 3055000);

        // Exibindo a cidade com a menor população
        Map.Entry<String, Integer> cidadeMenorPopulacao = cidades.firstEntry();
        System.out.println("Cidade com a menor população: " +
                cidadeMenorPopulacao.getKey() + " com " + cidadeMenorPopulacao.getValue() + " habitantes.");

        // Exibindo a cidade com a maior população
        Map.Entry<String, Integer> cidadeMaiorPopulacao = cidades.lastEntry();
        System.out.println("Cidade com a maior população: " +
                cidadeMaiorPopulacao.getKey() + " com " + cidadeMaiorPopulacao.getValue() + " habitantes.");
    }
}
