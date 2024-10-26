package POOTreino.Heranca.Ex1;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    Produto(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }
    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
