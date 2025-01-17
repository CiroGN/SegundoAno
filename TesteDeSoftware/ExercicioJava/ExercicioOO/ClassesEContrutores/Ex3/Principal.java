package TesteDeSoftware.ExercicioJava.ExercicioOO.ClassesEContrutores.Ex3;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("prod1", 1500);
        Produto produto2 = new Produto("prod2");

        produto1.mostraInfo();
        produto2.mostraInfo();
    }
}
