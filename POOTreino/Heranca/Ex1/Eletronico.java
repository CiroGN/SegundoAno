package POOTreino.Heranca.Ex1;

public class Eletronico extends Produto {
    private int garantiaMeses;

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    Eletronico(String nome, double preco, int quantidade, int garantiaMeses){
        super(nome, preco, quantidade);
        setGarantiaMeses(garantiaMeses);
    }
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}
