package TesteDeSoftware.ExercicioJava.ExercicioOO.ClassesEContrutores.Ex1;


public class Pessoa {
    public String nome;
    public int idade;

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}