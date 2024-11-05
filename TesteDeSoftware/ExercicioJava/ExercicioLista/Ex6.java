package TesteDeSoftware.ExercicioJava.ExercicioLista;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class Ex6 {
    public static void main(String[] args) {
        // Criando uma CopyOnWriteArrayList para armazenar IDs de usuários online
        CopyOnWriteArrayList<Integer> idsUsuarios = new CopyOnWriteArrayList<>();

        // Adicionando alguns IDs iniciais
        idsUsuarios.add(101);
        idsUsuarios.add(102);
        idsUsuarios.add(103);
        idsUsuarios.add(104);
        idsUsuarios.add(105);

        System.out.println("IDs iniciais: " + idsUsuarios);

        // Iniciando uma thread para simular a adição de novos IDs enquanto a lista é iterada
        Thread threadAdicao = new Thread(() -> {
            for (int i = 106; i <= 110; i++) {
                idsUsuarios.add(i);
                System.out.println("Adicionando ID: " + i);
                try {
                    Thread.sleep(100); // Pausa para simular processamento
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Iniciando uma thread para simular a exclusão de IDs enquanto a lista é iterada
        Thread threadRemocao = new Thread(() -> {
            for (int i = 101; i <= 103; i++) {
                idsUsuarios.remove(Integer.valueOf(i));
                System.out.println("Removendo ID: " + i);
                try {
                    Thread.sleep(150); // Pausa para simular processamento
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Iniciando as threads de adição e remoção
        threadAdicao.start();
        threadRemocao.start();

        // Iterando pela lista de IDs
        Iterator<Integer> iterator = idsUsuarios.iterator();
        while (iterator.hasNext()) {
            Integer id = iterator.next();
            System.out.println("Iterando ID: " + id);
            try {
                Thread.sleep(50); // Pausa para simular a iteração
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Esperando as threads terminarem
        try {
            threadAdicao.join();
            threadRemocao.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Exibindo a lista final de IDs
        System.out.println("Lista final de IDs: " + idsUsuarios);
    }
}
