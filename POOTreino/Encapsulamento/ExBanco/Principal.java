package POOTreino.Encapsulamento.ExBanco;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1500, "Ciro");
        conta.depositar(400);
        conta.sacar(3000);
        System.out.println("Nome: " + conta.getTitular() + "; Saldo: " + conta.getSaldo());
    }
}
