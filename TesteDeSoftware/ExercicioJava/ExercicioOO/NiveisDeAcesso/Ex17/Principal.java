package TesteDeSoftware.ExercicioJava.ExercicioOO.NiveisDeAcesso.Ex17;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.0);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto);
    }
}
