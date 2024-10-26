package POOTreino.Heranca.Ex1;

public class Alimento extends Produto{
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    Alimento(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        setDataValidade(dataValidade);
    }
    
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Data de Validade: " + getDataValidade());
    }
}