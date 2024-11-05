package TesteDeSoftware.ExercicioJava.ExercicioLista;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Criando uma lista de nomes de cidades
        ArrayList<String> cidades = new ArrayList<>();

        // Adicionando 5 cidades à lista
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");
        cidades.add("Belo Horizonte");
        cidades.add("Porto Alegre");

        // Exibindo a lista de cidades
        System.out.println("Lista de cidades: " + cidades);

        // Recebendo o nome da cidade a ser verificada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da cidade para verificar: ");
        String cidadeParaVerificar = scanner.nextLine();

        // Verificando se a cidade está na lista e, se sim, imprimindo a posição
        if (cidades.contains(cidadeParaVerificar)) {
            int posicao = cidades.indexOf(cidadeParaVerificar);
            System.out.println("A cidade " + cidadeParaVerificar + " está na posição: " + posicao);
        } else {
            System.out.println("A cidade " + cidadeParaVerificar + " não está na lista.");
        }

        scanner.close();
    }
}
