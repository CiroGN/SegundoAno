package POOTreino.Encapsulamento.ExAluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ciro", 19, 7.6);
        System.out.println("Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade() + " Media: " + aluno.getMedia());
    }
}
