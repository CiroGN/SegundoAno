package POOTreino.Encapsulamento.ExProduto;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto("Coisa", 1500, 1);
        p.mostraInfo();
        p.desconto(50);
    }    
}
