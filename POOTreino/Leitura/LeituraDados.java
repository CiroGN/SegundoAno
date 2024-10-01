package SegundoAno.POOTreino.Leitura;

import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Seu nome, idade e altura são: " + nome + ", " + idade + ", " + altura);
        sc.close();
    }
}
