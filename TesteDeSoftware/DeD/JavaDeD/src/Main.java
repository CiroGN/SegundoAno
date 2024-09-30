package TesteDeSoftware.DeD.JavaDeD.Classe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de inicialização de raças e classes
        Raca anaoMontanha = new Raca("Anao da Montanha");
        Raca humano = new Raca("Humano");
        Raca draconato = new Raca("Draconato");
        Raca meioorc = new Raca("Meio-orc");
        Raca elfo = new Raca("Elfo");
        Raca halfling = new Raca("Halfling");
        Raca altoelfo = new Raca("Alto Elfo");
        Raca gnomodafloresta = new Raca("Gnomo da floresta");
        Raca gnomodasrochas = new Raca("Gnomo das rochas");
        Raca anao = new Raca("Anao");
        Raca halflingrobusto = new Raca("Halfling-robusto");
        Raca gnomo = new Raca("Gnomo");
        Raca tiefling = new Raca("Tiefling");
        Raca anaodacolina = new Raca("Anao da colina");
        Raca anaodafloresta = new Raca("Elfo da floresta");
        Raca drow = new Raca("Drow");
        Raca halflingpesleves = new Raca("Halfling pes-leves");
        Raca meioelfo = new Raca("meio-elfo");

        Classe guerreiro = new Classe("Guerreiro");
        Classe mago = new Classe("Mago");
        Classe ladino = new Classe("Ladino");
        Classe barbaro = new Classe("Barbaro");

        // Outras raças e classes podem ser criadas e adicionadas aqui...

        // Passo 1: Escolha do nome do personagem
        System.out.println("Bem-vindo à criação de personagens de D&D!");
        System.out.print("Digite o nome do seu personagem: ");
        String nomePersonagem = scanner.nextLine();

        // Passo 2: Escolha da raça
        System.out.println("Escolha a raça do seu personagem:");
        System.out.println("1. Anao da Montanha, 2. Humano, 3. Draconato, 4. Meio-orc, 5. Elfo, 6. Halfling, ");
        System.out.println("7. Alto Elfo, 8. Gnomo da floresta, 9. Gnomo das rochas, 10. Anao, ");
        System.out.println("11. Halfling-robusto, 12. Gnomo, 13. Tiefling, 14. Anao da colina, ");
        System.out.println("15. Elfo da floresta, 16. Drow, 17. Halfling pes-leves, 18. Meio-elfo");
        // Adicione mais raças aqui
        int escolhaRaca = scanner.nextInt();
        Raca racaEscolhida = null;

        switch (escolhaRaca) {
            case 1:
                racaEscolhida = anaoMontanha;
                break;
            case 2:
                racaEscolhida = humano;
                break;
            case 3:
                racaEscolhida = draconato;
                break;
            case 4:
                racaEscolhida = meioorc;
                break;
            case 5:
                racaEscolhida = elfo;
                break;
            case 6:
                racaEscolhida = halfling;
                break;
            case 7:
                racaEscolhida = altoelfo;
                break;
            case 8:
                racaEscolhida = gnomodafloresta;
                break;
            case 9:
                racaEscolhida = gnomodasrochas;
                break;
            case 10:
                racaEscolhida = anao;
                break;
            case 11:
                racaEscolhida = halflingrobusto;
                break;
            case 12:
                racaEscolhida = gnomo;
                break;
            case 13:
                racaEscolhida = tiefling;
                break;
            case 14:
                racaEscolhida = anaodacolina;
                break;
            case 15:
                racaEscolhida = anaodafloresta;
                break;
            case 16:
                racaEscolhida = drow;
                break;
            case 17:
                racaEscolhida = halflingpesleves;
                break;
            case 18:
                racaEscolhida = meioelfo;
                break;
            default:
                System.out.println("Raça inválida. Escolhendo Humano como padrão.");
                racaEscolhida = humano;
                break;
        }

        // Passo 3: Escolha da classe
        System.out.println("Escolha a classe do seu personagem:");
        System.out.println("1. Guerreiro, 2. Mago, 3. Ladino, 4. Barbaro");
        // Adicione mais classes aqui
        int escolhaClasse = scanner.nextInt();
        Classe classeEscolhida = null;

        switch (escolhaClasse) {
            case 1:
                classeEscolhida = guerreiro;
                break;
            case 2:
                classeEscolhida = mago;
                break;
            case 3:
                classeEscolhida = ladino;
                break;
            case 4:
                classeEscolhida = barbaro;
                break;
            default:
                System.out.println("Classe inválida. Escolhendo Guerreiro como padrão.");
                classeEscolhida = guerreiro;
                break;
        }

        Map<String, Integer> habilidades = new HashMap<>();
        habilidades.put("forca", 8);
        habilidades.put("destreza", 8);
        habilidades.put("constituicao", 8);
        habilidades.put("inteligencia", 8);
        habilidades.put("sabedoria", 8);
        habilidades.put("carisma", 8);

        // Passo 4: Criar o personagem
        Personagem personagem = new Personagem(nomePersonagem, racaEscolhida, classeEscolhida, habilidades);
        
        // Passo 5: Distribuir os pontos nas habilidades
        DistribuicaoPontos distribuicaoPontos = new DistribuicaoPontos();
        distribuicaoPontos.distribuirPontos(personagem.getHabilidades(), personagem);
        personagem.calcularPontosDeVida();

        // Exibir informações do personagem
        System.out.println("\nPersonagem criado com sucesso:");
        System.out.println(personagem);

        scanner.close();
    }
}