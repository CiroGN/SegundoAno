package TesteDeSoftware.DeD.JavaDeD.Classe;

import java.util.Map;
import java.util.HashMap;

public class Personagem {
    private String nome;
    private Raca raca;
    private Classe classe;
    private Map<String, Integer> habilidades; // Mapa de habilidades como força, destreza, etc.
    private int pontosDeVida;
    private int nivel = 1;

    // Inicializar as habilidades com valores padrão
    public Personagem(String nome, Raca raca, Classe classe, Map<String, Integer> habilidades) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;

        // Inicializa o mapa de habilidades com valores padrão se não fornecido
        this.habilidades = new HashMap<>();
        this.habilidades.put("forca", habilidades.getOrDefault("forca", 8));
        this.habilidades.put("destreza", habilidades.getOrDefault("destreza", 8));
        this.habilidades.put("constituicao", habilidades.getOrDefault("constituicao", 8));
        this.habilidades.put("inteligencia", habilidades.getOrDefault("inteligencia", 8));
        this.habilidades.put("sabedoria", habilidades.getOrDefault("sabedoria", 8));
        this.habilidades.put("carisma", habilidades.getOrDefault("carisma", 8));

        // Aplicar modificadores raciais
        aplicarModificadoresRaciais();

        // Calcular pontos de vida baseados na classe e constituição
        calcularPontosDeVida();
    }

    // Função que aplica os modificadores raciais nas habilidades
    public void aplicarModificadoresRaciais() {
        for (Map.Entry<String, Integer> modificador : raca.getModificadores().entrySet()) {
            String habilidade = modificador.getKey();
            int valorModificador = modificador.getValue();
            
            // Verifica se a habilidade está presente no mapa antes de tentar aplicá-la
            if (habilidades.containsKey(habilidade)) {
                habilidades.put(habilidade, habilidades.get(habilidade) + valorModificador);
            } else {
                System.out.println("Habilidade " + habilidade + " não encontrada nas habilidades do personagem.");
            }
        }
    }

    public void calcularPontosDeVida() {
        // Verifique se a classe foi inicializada corretamente
        if (this.classe != null) {
            int pontosDeVidaClasse = this.classe.getPontosDeVidaBase(); // Obtém os pontos de vida da classe
    
            // Calcula o modificador de Constituição com base no valor de Constituição do personagem
            int modificadorConstituicao = (habilidades.get("constituicao") - 10) / 2;
    
            // Calcula os pontos de vida totais
            this.pontosDeVida = pontosDeVidaClasse + (modificadorConstituicao * this.nivel);
    
            // Verifica se os pontos de vida não estão negativos
            if (this.pontosDeVida < 1) {
                this.pontosDeVida = 1; // Regra para que um personagem sempre tenha ao menos 1 ponto de vida
            }
        } else {
            System.out.println("Classe não definida corretamente.");
        }
    }
    
    // Método para acessar as habilidades do personagem
    public Map<String, Integer> getHabilidades() {
        return habilidades;
    }

    // Método para acessar a classe do personagem
    public Classe getClasse() {
        return classe;
    }

    // Getter para exibir o personagem
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nRaça: " + raca.getNome() +
               "\nClasse: " + classe.getNome() +
               "\nHabilidades: " + habilidades +
               "\nPontos de Vida: " + pontosDeVida +
               "\nNível: " + nivel;
    }
}