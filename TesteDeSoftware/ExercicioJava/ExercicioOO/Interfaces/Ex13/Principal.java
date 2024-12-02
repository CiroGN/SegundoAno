package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex13;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        List<String> operacoes = new ArrayList<>();

        double a = 10, b = 5;

        operacoes.add("Adição: " + calculadora.adicionar(a, b));
        operacoes.add("Subtração: " + calculadora.subtrair(a, b));
        operacoes.add("Multiplicação: " + calculadora.multiplicar(a, b));
        operacoes.add("Divisão: " + calculadora.dividir(a, b));

        System.out.println("Operações realizadas:");
        for (String operacao : operacoes) {
            System.out.println(operacao);
        }
    }
}
