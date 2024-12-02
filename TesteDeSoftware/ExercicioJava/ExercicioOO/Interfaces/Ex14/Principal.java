package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex14;

public class Principal {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Aguia aguia = new Aguia();
        Peixe peixe = new Peixe();

        System.out.println("Comportamento do Pato:");
        pato.voar();
        pato.nadar();

        System.out.println("\nComportamento da Águia:");
        aguia.voar();

        System.out.println("\nComportamento do Peixe:");
        peixe.nadar();
    }
}
