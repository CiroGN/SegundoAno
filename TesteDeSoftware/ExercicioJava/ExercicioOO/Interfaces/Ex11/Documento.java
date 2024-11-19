package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex11;

public class Documento implements Imprimivel{
    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo o documento: " + titulo);
    }
}
