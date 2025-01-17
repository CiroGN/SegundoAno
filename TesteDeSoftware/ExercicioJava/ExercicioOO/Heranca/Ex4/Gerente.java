package TesteDeSoftware.ExercicioJava.ExercicioOO.Heranca.Ex4;

public class Gerente extends Funcionario{
    public String departamento;

    Gerente(String nome, double salario, String departamento){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
    public String toString() {
        return "Gerente - Nome: " + nome + ", Salario: " + salario + ", Departamento: " + departamento;
    }
}
