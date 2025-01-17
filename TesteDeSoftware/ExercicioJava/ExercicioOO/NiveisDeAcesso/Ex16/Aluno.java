package TesteDeSoftware.ExercicioJava.ExercicioOO.NiveisDeAcesso.Ex16;

public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chamando o método protegido da classe Pessoa
        System.out.println("Curso: " + curso);
    }
}
