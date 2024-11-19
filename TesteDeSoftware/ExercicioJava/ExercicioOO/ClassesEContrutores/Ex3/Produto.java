package TesteDeSoftware.ExercicioJava.ExercicioOO.ClassesEContrutores.Ex3;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome + ", Preço: " + preco);
    }
}