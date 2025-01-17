package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex12;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.exibirVelocidade(); // Velocidade inicial
        carro.acelerar(50);       
        carro.acelerar(100);      
        carro.acelerar(50); // Tenta acelerar além da velocidade máxima
        carro.exibirVelocidade(); // Exibe a velocidade final
    }
}
