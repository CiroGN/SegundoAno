package POOTreino.Heranca.Teste;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Augusto", 20);
        Aluno aluno1 = new Aluno("Joao", 25, 123456);

        System.out.println("Nome: " + p1.getNome() + " idade: " + p1.getIdade());
        aluno1.mostrInfo();
        // p1.setNome("João");
        // p1.setIdade(25);

        // aluno1.setNome("Maria");
        // aluno1.setIdade(22);
        // aluno1.setMatricula(123456);
    }
}
