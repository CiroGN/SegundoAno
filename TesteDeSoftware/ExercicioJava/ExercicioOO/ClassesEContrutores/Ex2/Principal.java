package TesteDeSoftware.ExercicioJava.ExercicioOO.ClassesEContrutores.Ex2;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Bom", "Melhor", 2025);
        carro.imprimeCarro();
        carro.setMarca("MaisBom");
        carro.imprimeCarro();
    }
}
