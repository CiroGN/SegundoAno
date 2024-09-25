package src.main;
import src.personagens.Anao;
import src.personagens.ClasseDistribuicaoPontos27;
import src.personagens.DistribuicaoPontos;
import src.personagens.Humano;
import src.personagens.Personagem;
import src.personagens.Raca;

public class Main {
    public static void main(String[] args) {
        DistribuicaoPontos distribuicao = new ClasseDistribuicaoPontos27();
        Raca humano = new Humano();
        Raca anao = new Anao();

        Personagem personagem1 = new Personagem("Bruenor", distribuicao, humano);
        Personagem personagem2 = new Personagem("Drizzt", distribuicao, anao);
        
        System.out.println("Personagem 1: " + personagem1.getNome());
        System.out.println("Força: " + personagem1.getForca());
        System.out.println("Constituição: " + personagem1.getConstituicao());
        System.out.println("Pontos de Vida: " + personagem1.getPontosDeVida());
        
        System.out.println("\nPersonagem 2: " + personagem2.getNome());
        System.out.println("Força: " + personagem2.getForca());
        System.out.println("Constituição: " + personagem2.getConstituicao());
        System.out.println("Pontos de Vida: " + personagem2.getPontosDeVida());
    }
}