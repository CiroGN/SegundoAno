package src.personagens;

public class Personagem {
    private String nome;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private int pontosDeVida;

    private DistribuicaoPontos estrategiaDitribuicao;
    private Raca raca;

    // Construtor
    public Personagem(String nome, DistribuicaoPontos estrategiaDitribuicao, Raca raca) {
        this.nome = nome;
        this.estrategiaDitribuicao = estrategiaDitribuicao;
        this.raca = raca;
        this.estrategiaDitribuicao.distribuirPontos(this);
        this.raca.aplicarBonusRacial(this);
        calcularPontosDeVida();
    }

    // Métodos
    public void calcularPontosDeVida() {
        int modificadorConstituicao = (this.constituicao - 10) / 2;
        this.pontosDeVida = 10 + modificadorConstituicao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
}
