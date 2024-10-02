package POOTreino.Encapsulamento.Encapsulamento2.ExPessoa;

public class Principa{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ciro", 19, "101.337.509-22");
        
        // Acessando os dados encapsulados
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Cpf: " + pessoa.getCpf());
        
        // Alterando os dados encapsulados
        pessoa.setNome("João");
        pessoa.setIdade(25);
        pessoa.setCpf("504.151.409-78");
        
        // Acessando novamente os dados encapsulados
        System.out.println("\nNome alterado: " + pessoa.getNome());
        System.out.println("Idade alterada: " + pessoa.getIdade());
        System.out.println("Cpf alterado: " + pessoa.getCpf());
    }
}