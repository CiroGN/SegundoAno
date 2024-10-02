package SegundoAno.POOTreino.ExercicioContaBancaria;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome e saldo bancario:");
        ContaBancaria c = new ContaBancaria("Ciro", 1576.96);
        System.out.println("nome: " + c.nome + "; saldo: " + c.saldo);
        c.depositar(760);
        c.sacar(1500);
        sc.close();
    }
}
