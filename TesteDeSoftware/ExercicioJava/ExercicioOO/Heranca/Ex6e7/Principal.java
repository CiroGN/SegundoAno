package TesteDeSoftware.ExercicioJava.ExercicioOO.Heranca.Ex6e7;

public class Principal {
    public static void main(String[] args) {
        Esportivo esportivo = new Esportivo("Bom", 2010, "Vermelho", "Senna");
        System.out.println("Veiculo tipo: " + esportivo.tipo + ", Modelo: " + esportivo.modelo + ", Ano: " + esportivo.ano + ", Cor: "
        + esportivo.cor + ", Edicao: " + esportivo.edicao);
    }
}
