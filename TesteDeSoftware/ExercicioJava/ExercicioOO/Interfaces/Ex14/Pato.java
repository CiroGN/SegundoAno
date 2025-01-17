package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex14;

public class Pato implements Voador, Nadador{
    @Override
    public void voar() {
        System.out.println("O pato está voando a baixa altitude.");
    }

    @Override
    public void nadar() {
        System.out.println("O pato está nadando no lago.");
    }
}
