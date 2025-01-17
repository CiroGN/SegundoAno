package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex12;

public class Carro implements Veiculo {
    private int velocidadeAtual;

    public Carro() {
        this.velocidadeAtual = 0;
    }

    @Override
    public void acelerar(int incremento) {
        int novaVelocidade = velocidadeAtual + incremento;
        if (novaVelocidade > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
            System.out.println("Velocidade máxima atingida: " + VELOCIDADE_MAXIMA + " km/h");
        } else {
            velocidadeAtual = novaVelocidade;
            System.out.println("Velocidade aumentada para: " + velocidadeAtual + " km/h");
        }
    }

    @Override
    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
