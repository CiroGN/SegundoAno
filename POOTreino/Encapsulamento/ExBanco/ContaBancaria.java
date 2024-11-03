package POOTreino.Encapsulamento.ExBanco;

public class ContaBancaria {
    private double saldo;
    public String titular;

    ContaBancaria(double saldo, String titular){
        setSaldo(saldo);
        setTitular(titular);
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }
}
