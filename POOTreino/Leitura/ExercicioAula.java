package SegundoAno.POOTreino.Leitura;

import java.util.Scanner;

public class ExercicioAula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[3];
        float[] altura = new float[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            nome[i] = sc.nextLine();
            System.out.print("Altura do aluno " + (i + 1) + ": ");
            altura[i] = sc.nextFloat(); //inputa um enter por causa do /n, o que faz pular o nome do aluno
        }
        int i = 0;
        System.out.print("Alunos cadastrados e suas alturas: ");
        while(i < nome.length){
            System.out.print(nome[i] + ", " + altura[i] + "; ");
            i++;
        }
        sc.close();
    }
}
