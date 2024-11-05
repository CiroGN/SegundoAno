package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.HashMap;
import java.util.Map;

public class Ex7 {
    public static void main(String[] args) {
        // Criando um HashMap para armazenar o nome dos estudantes e suas notas finais
        HashMap<String, Double> notasEstudantes = new HashMap<>();

        // Adicionando 5 entradas ao HashMap
        notasEstudantes.put("Ana", 8.5);
        notasEstudantes.put("Bruno", 6.7);
        notasEstudantes.put("Carlos", 9.0);
        notasEstudantes.put("Diana", 7.3);
        notasEstudantes.put("Eduardo", 5.9);

        // Exibindo apenas os estudantes que obtiveram nota acima de 7
        System.out.println("Estudantes com nota acima de 7:");
        for (Map.Entry<String, Double> entry : notasEstudantes.entrySet()) {
            if (entry.getValue() > 7.0) {
                System.out.println("Nome: " + entry.getKey() + " | Nota: " + entry.getValue());
            }
        }
    }
}
