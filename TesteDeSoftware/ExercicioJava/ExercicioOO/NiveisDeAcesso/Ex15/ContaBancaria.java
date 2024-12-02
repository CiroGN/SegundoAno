package TesteDeSoftware.ExercicioJava.ExercicioOO.NiveisDeAcesso.Ex15;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para depósito deve ser maior que zero.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor para saque deve ser maior que zero.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
