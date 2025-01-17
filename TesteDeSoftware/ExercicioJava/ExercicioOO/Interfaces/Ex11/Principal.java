package TesteDeSoftware.ExercicioJava.ExercicioOO.Interfaces.Ex11;

public class Principal {
    public static void main(String[] args) {
        Imprimivel doc = new Documento("Relatório Anual");
        Imprimivel foto = new Foto("Paisagem da Montanha");

        doc.imprimir();
        foto.imprimir();
    }
}
