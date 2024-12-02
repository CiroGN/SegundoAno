package TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex19.model;

public class Cliente {
    public String nome;
    public String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}
