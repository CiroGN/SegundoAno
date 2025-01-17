package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.HashMap;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // Criando um HashMap para armazenar o nome dos produtos e seus preços
        HashMap<String, Double> produtos = new HashMap<>();

        // Adicionando alguns produtos ao HashMap
        produtos.put("Arroz", 5.99);
        produtos.put("Feijão", 4.49);
        produtos.put("Macarrão", 3.79);
        produtos.put("Óleo", 7.99);
        produtos.put("Açúcar", 2.99);

        // Solicitando ao usuário que insira o nome do produto
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        // Verificando se o produto está no HashMap
        if (produtos.containsKey(nomeProduto)) {
            System.out.println("O preço do produto " + nomeProduto + " é: R$" + produtos.get(nomeProduto));
        } else {
            System.out.println("Produto não encontrado.");
        }

        scanner.close();
    }
}
