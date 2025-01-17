package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex10;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
}
