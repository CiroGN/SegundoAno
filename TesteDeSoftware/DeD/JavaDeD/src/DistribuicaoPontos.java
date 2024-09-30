package TesteDeSoftware.DeD.JavaDeD.Classe;

import java.text.Normalizer;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class DistribuicaoPontos {

    private int pontosDisponiveis = 27;
    private static final Map<String, String> HABILIDADES_PADRAO = new HashMap<>();

    static {
        HABILIDADES_PADRAO.put("forca", "forca"); // Removemos acentos para comparação
        HABILIDADES_PADRAO.put("destreza", "destreza");
        HABILIDADES_PADRAO.put("constituicao", "constituicao");
        HABILIDADES_PADRAO.put("inteligencia", "inteligencia");
        HABILIDADES_PADRAO.put("sabedoria", "sabedoria");
        HABILIDADES_PADRAO.put("carisma", "carisma");
    }

    public void distribuirPontos(Map<String, Integer> habilidades, Personagem personagem) {
        Scanner scanner = new Scanner(System.in);

        while (pontosDisponiveis > 0) {
            System.out.println("Pontos disponíveis: " + pontosDisponiveis);
            System.out.println("Habilidades: " + habilidades.toString());
            System.out.print("Escolha uma habilidade para aumentar (Força, Destreza, Constituição, Inteligência, Sabedoria, Carisma): ");
            String habilidadeInput = scanner.nextLine();

            // Normaliza a entrada e remove acentos
            String habilidadeNormalizada = removerAcentos(habilidadeInput.toLowerCase());

            if (HABILIDADES_PADRAO.containsKey(habilidadeNormalizada)) {
                String habilidadePadrao = HABILIDADES_PADRAO.get(habilidadeNormalizada);
                int valorAtual = habilidades.get(habilidadePadrao);
                if (valorAtual < 15) {
                    int custo = calcularCusto(valorAtual + 1);
                    if (pontosDisponiveis >= custo) {
                        habilidades.put(habilidadePadrao, valorAtual + 1);
                        pontosDisponiveis -= custo;
                    } else {
                        System.out.println("Pontos insuficientes para aumentar " + habilidadePadrao + " para " + (valorAtual + 1));
                    }
                } else {
                    System.out.println(habilidadePadrao + " já está no máximo (15).");
                }
            } else {
                System.out.println("Habilidade inválida. Certifique-se de que a habilidade esteja correta.");
            }
        }
    }

    // Cálculo do custo para aumentar uma habilidade
    private int calcularCusto(int novoValor) {
        if (novoValor <= 13) {
            return 1;  // Custo normal até 13
        } else if (novoValor == 14) {
            return 2;  // Custo adicional para 14
        } else if (novoValor == 15) {
            return 2;  // Custo adicional para 15
        }
        return 0;
    }

    // Função para remover acentos de uma string
    private String removerAcentos(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", ""); // Remove caracteres não-ASCII (acentos)
    }
}