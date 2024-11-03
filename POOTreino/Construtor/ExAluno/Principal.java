package POOTreino.Construtor.ExAluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ciro", 123);
        aluno.alterarCurso("Engenharia de Software");
        aluno.exibirDetalhes();
    }
}
