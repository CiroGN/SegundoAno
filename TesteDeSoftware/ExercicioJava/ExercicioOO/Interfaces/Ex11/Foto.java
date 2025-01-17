package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex11;

public class Foto implements Imprimivel{
    private String descricao;

    public Foto(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo a foto: " + descricao);
    }
}
