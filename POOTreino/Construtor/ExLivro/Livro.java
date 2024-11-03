package POOTreino.Construtor.ExLivro;

public class Livro {
    public String livro;
    public String autor;
    public int anoPublicacao;

    Livro(String livro, String autor, int anoPublicacao){
        this.livro = livro;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public void exibirDetalhes(){
        System.out.println("Nome do livreo: " + livro + "; autor: " + autor + "; anoPublicacao: " + anoPublicacao);
    }
    
}
