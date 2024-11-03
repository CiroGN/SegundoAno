package POOTreino.Construtor.ExProduto;

public class Produto {
    String nome;
    double preco;
    int quantidade = 0;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidade = 0;
    }

    public void adicionarEstoque(int adicionaQuantidade) {
        quantidade = quantidade + adicionaQuantidade;
        System.out.println("Itens adicionados: " + adicionaQuantidade);
        System.out.println("Itens em estoque: " + quantidade);
    }
    public void removeEstoque(int removeQuantidade) {
        if (quantidade < removeQuantidade) {
            System.out.println("Não tem como remover " + removeQuantidade + " pois há somente " + quantidade + " que podem ser removidos");
            return;
        } else {
            quantidade = quantidade - removeQuantidade;
            System.out.println("Itens removidos: " + removeQuantidade); 
        }
        System.out.println("Itens em estoque: " + quantidade);
    }
}
