package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.Hashtable;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Criando uma Hashtable para armazenar as notas dos alunos
        Hashtable<Integer, Double> notas = new Hashtable<>();

        // Adicionando alguns alunos e suas notas
        notas.put(101, 7.5);
        notas.put(102, 8.0);
        notas.put(103, 9.2);
        notas.put(104, 6.8);
        notas.put(105, 7.0);

        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando o número de matrícula do aluno
        System.out.print("Digite o número de matrícula do aluno: ");
        int matricula = scanner.nextInt();

        // Verificando se o número de matrícula existe na Hashtable
        if (notas.containsKey(matricula)) {
            // Se encontrado, exibe a nota atual
            System.out.println("Nota atual do aluno: " + notas.get(matricula));
            
            // Solicita uma nova nota para o aluno
            System.out.print("Digite a nova nota do aluno: ");
            double novaNota = scanner.nextDouble();
            
            // Atualiza a nota do aluno
            notas.put(matricula, novaNota);
            System.out.println("Nota atualizada com sucesso!");
        } else {
            // Se não encontrado, informa o usuário
            System.out.println("Aluno não encontrado.");
        }

        // Fechando o scanner
        scanner.close();

        // Exibindo as notas finais de todos os alunos
        System.out.println("\nNotas finais dos alunos:");
        notas.forEach((mat, nota) -> System.out.println("Matrícula: " + mat + " | Nota: " + nota));
    }
}
