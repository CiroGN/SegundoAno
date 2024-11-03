public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + matricula);
    }
}
