package POOTreino.Encapsulamento.ExProduto;

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

    public double desconto(double desconto) {
        // double desconto;
        desconto = (getPreco() / 100) * desconto;        
        double newPreco = getPreco() - desconto;
        setPreco(newPreco);
        System.out.println("novo preco após o desconto: " + newPreco);
        return newPreco;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
    }
}
