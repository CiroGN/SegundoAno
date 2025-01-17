package TesteDeSoftware.ExercicioJava.ExercicioOO.NiveisDeAcesso.Ex17;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
