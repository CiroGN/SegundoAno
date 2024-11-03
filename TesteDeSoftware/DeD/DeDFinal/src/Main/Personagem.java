package TesteDeSoftware.DeD.DeDFinal.src.Main;

public class Personagem extends Atributo{
    protected Classe classe;
    protected String nome;
    protected String nomeRaca;

    public Personagem(Classe classe, String nome, String nomeRaca){
        this.classe = classe;
        this.nome = nome;
        this.nomeRaca = nomeRaca;
    }

    public void mostraRaca(){
        System.out.println("===========================================");
        System.out.println("Raça: " + nomeRaca);
        System.out.println("===========================================");
    }
}
