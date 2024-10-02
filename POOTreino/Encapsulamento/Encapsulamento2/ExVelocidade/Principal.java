package POOTreino.Encapsulamento.Encapsulamento2.ExVelocidade;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("show", "bala", 70);
        System.out.println("Marca: " + carro.marca + "; Modelo: " + carro.modelo + "; Velocidade: " + carro.velocidadeAtual);
    }
}
