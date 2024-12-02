package TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex19;

import TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex19.service.ClienteService;
import TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex19.model.Cliente;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria Oliveira", "maria@exemplo.com");

        ClienteService clienteService = new ClienteService();

        clienteService.salvarCliente(cliente1);

        clienteService.excluirCliente(cliente1);
    }
}
