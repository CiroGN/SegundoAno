package POOTreino.Encapsulamento.ExLivro;

public class Principal {
    public static void main(String[] args){
        Livro l1 = new Livro("A Game of Thrones", "George R. R. Martin", 540.34);
        System.out.println("Título: " + l1.titulo + " Autor: " + l1.autor + "Preco: " + l1.getPreco());
    }
}
