package TesteDeSoftware.ExercicioJava.ExercicioOO.NiveisDeAcesso.Ex18;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");

        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("CPF do cliente: " + cliente.cpf);
    }
}
