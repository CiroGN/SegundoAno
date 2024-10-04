public class Personagem {
    protected Classe classe;
    protected String nome;
    protected String nomeRaca;

    public Personagem(Classe classe, String nome, String nomeRaca){
        this.classe = classe;
        this.nome = nome;
        this.nomeRaca = nomeRaca;
    }

    public void mostraInfo(){
        System.out.print("Nome: " + nome);
        System.out.print(" - Raça: " + nomeRaca);
        System.out.println(" - Classe: " + classe.tipoClasse);
    }
}
