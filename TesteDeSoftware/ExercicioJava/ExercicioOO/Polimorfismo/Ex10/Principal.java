package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex10;

public class Principal {
    public static void main(String[] args) {
        Funcionario horista = new FuncionarioHorista("Carlos", 160, 20);
        Funcionario mensalista = new FuncionarioMensalista("Ana", 3000);

        System.out.println(horista);
        System.out.println(mensalista);
    }
}
