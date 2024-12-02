package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex13;

public class Calculadora implements OperacaoMatematica{
    @Override
    public double adicionar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
}
