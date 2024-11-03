package POOTreino.Construtor.ExFilme;

public class Filme{
    String titulo, genero;
    int anoLancamento;
    
    Filme(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
        anoLancamento = 2024;
    }

    public void exibirInformacoes(){
        System.out.println("Titulo do filme: " + titulo + "; genero: " + genero + "; anoLancamento: " + anoLancamento);
    }
}