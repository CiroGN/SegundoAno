package POOTreino.Encapsulamento.ExLivro;

public class Livro {
    public String titulo, autor;
    private double preco;
    Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        setPreco(preco);

    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco <= 0){
            System.out.println("Preço inválido! O preço do livro deve ser maior que zero.");
        } else {
            this.preco = preco;
        }
    }
}
