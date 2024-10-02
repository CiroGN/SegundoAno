package POOTreino.Construtor.ExAluno;

public class Aluno {
    String nome;
    boolean curso;
    int matricula;
    String novoCurso;

    Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = false;
    }

    public void alterarCurso(String novoCurso){
        this.novoCurso = novoCurso;
        curso = true;
    }
    public void exibirDetalhes(){
        System.out.println("nome aluno: " + nome + " " + matricula);
        System.out.println("esta cursando? " + curso);
        if(curso){
            System.out.println("está cursando: " + novoCurso);
        } else {
            System.out.println("não está cursando nenhum curso");
        }
    }
}
