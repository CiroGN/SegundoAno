package TesteDeSoftware.ExercicioJava.ExercicioMaps;

import java.util.concurrent.ConcurrentHashMap;

public class Ex13 {
    public static void main(String[] args) {
        // Criando um ConcurrentHashMap para armazenar produtos e suas quantidades em estoque
        ConcurrentHashMap<String, Integer> estoque = new ConcurrentHashMap<>();

        // Adicionando alguns produtos ao estoque
        estoque.put("Produto A", 100);
        estoque.put("Produto B", 150);
        estoque.put("Produto C", 200);

        // Thread para simular a venda de produtos
        Thread vendasThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String produto = "Produto A";
                // Verifica se o produto está em estoque antes de vender
                estoque.computeIfPresent(produto, (key, val) -> {
                    if (val > 0) {
                        System.out.println("Vendendo 1 unidade de " + produto + ". Estoque atual: " + val);
                        return val - 1; // Diminui o estoque
                    } else {
                        System.out.println(produto + " sem estoque.");
                        return val; // Retorna o valor atual sem alteração
                    }
                });
                try {
                    Thread.sleep(100); // Pausa para simular o tempo de venda
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Thread para simular a reposição de produtos
        Thread reposicaoThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String produto = "Produto A";
                estoque.compute(produto, (key, val) -> {
                    int novoEstoque = (val == null ? 0 : val) + 2; // Aumenta o estoque em 2
                    System.out.println("Repondo 2 unidades de " + produto + ". Estoque atual: " + novoEstoque);
                    return novoEstoque; // Atualiza o estoque
                });
                try {
                    Thread.sleep(150); // Pausa para simular o tempo de reposição
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Iniciando as threads
        vendasThread.start();
        reposicaoThread.start();

        // Esperando as threads terminarem
        try {
            vendasThread.join();
            reposicaoThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Exibindo o estoque final
        System.out.println("\nEstoque final:");
        estoque.forEach((produto, quantidade) -> System.out.println(produto + ": " + quantidade));
    }
}
