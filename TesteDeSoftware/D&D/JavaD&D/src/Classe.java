public class Classe {
    private String nome;
    private int pontosDeVidaBase;

    public Classe(String nome) {
        this.nome = nome;
        definirPontosDeVidaBase();
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVidaBase() {
        return pontosDeVidaBase;
    }

    // Definir os pontos de vida base de acordo com a classe
    private void definirPontosDeVidaBase() {
        switch (nome.toLowerCase()) {
            case "guerreiro":
                pontosDeVidaBase = 10;
                break;
            case "mago":
                pontosDeVidaBase = 6;
                break;
            case "ladino":
                pontosDeVidaBase = 8;
                break;
            case "barbaro":
                pontosDeVidaBase = 12;
                break;
            default:
                pontosDeVidaBase = 8;  // Valor padrão se a classe não for reconhecida
                break;
        }
    }
}