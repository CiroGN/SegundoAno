package SegundoAno.POOTreino.TiposDeDados;

public class ExercicioAula {
    public static void nada(String[] args){
        String nome, curso; 
        String[] disciplinas = {"POO", "IDE", "Coisa"};
        nome = "Ciro "; curso = "BCC ";
        System.out.println("Nome: " + nome);
        System.out.println("curso: " + curso); 
        System.out.print("disciplinas:");
        for(int i = 0 ;i < disciplinas.length; i++){
             System.out.print(" " + disciplinas[i]);
    
        }
    }
    public static void main(String[] args) {
        String marca, modelo;
        int ano;
        double valor = 75.389;
        marca = "Fiat"; modelo = "Palio"; ano = 2020;
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + valor);
    
    }
}
