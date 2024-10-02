package POOTreino.Encapsulamento.ExAluno;

public class Aluno {
    private String nome;
    private int idade;
    private double media;

    Aluno(String nome, int idade, double media){
        setNome(nome);
        setIdade(idade);
        setMedia(media);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade <0) {
            System.out.println("idade não permitida");
            return;
        } else{
            this.idade = idade;
        }
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        if (media < 0 || media > 10) {
            System.out.println("média invalida");
            return;
        } else {
            this.media = media;
        }
    }
}
