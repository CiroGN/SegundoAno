package POOTreino.Construtor.ExercicioContaBancaria;
import java.util.Scanner;

public class ContaBancaria {
    public String nome;
    protected double saldo;
    Scanner sc = new Scanner(System.in);

    ContaBancaria(String nome, Double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("Novo saldo após deposito: " + saldo);
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Novo saldo após saque: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
