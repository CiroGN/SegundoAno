package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex10;

public class FuncionarioMensalista extends Funcionario {
    private double salarioMensal;

    public FuncionarioMensalista(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
