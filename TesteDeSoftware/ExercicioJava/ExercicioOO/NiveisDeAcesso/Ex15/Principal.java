package TesteDeSoftware.ExercicioJava.ExercicioOO.NiveisDeAcesso.Ex15;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        // Testando os métodos
        conta.exibirInformacoes();
        conta.depositar(500.0);
        conta.exibirInformacoes();
        conta.sacar(300.0);
        conta.exibirInformacoes();
        conta.sacar(1500.0); // Testando saldo insuficiente
        conta.exibirInformacoes();
    }
}
