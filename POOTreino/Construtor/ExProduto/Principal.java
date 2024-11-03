package POOTreino.Construtor.ExProduto;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto("Tela", 130.50);
        p.adicionarEstoque(5);
        p.removeEstoque(8);
    }
}
