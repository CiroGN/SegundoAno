package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex10;

abstract class Funcionario {
    protected String nome;

    Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", Salário: " + calcularSalario();
    }
}
