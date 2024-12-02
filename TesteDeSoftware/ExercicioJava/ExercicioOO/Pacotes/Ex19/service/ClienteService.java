package TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex19.service;
import TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex19.model.Cliente;

public class ClienteService {
    public void salvarCliente(Cliente cliente) {
        System.out.println("Cliente " + cliente.nome + " salvo com sucesso!");
    }

    public void excluirCliente(Cliente cliente) {
        System.out.println("Cliente " + cliente.nome + " excluído com sucesso!");
    }
}
