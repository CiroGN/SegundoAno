package POOTreino.Encapsulamento.Encapsulamento2.ExChamada;

public class Principal {
    public static void main(String[] args) {
        Chamada c = new Chamada("Ciro", "123", 2);
        System.out.println("Aluno: " + c.nomeEstudante + " " + c.codigo + ", Faltas: " + c.faltas); 
    }
}
