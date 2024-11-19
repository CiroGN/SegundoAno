package TesteDeSoftware.ExercicioJava.ExercicioOO.Heranca.Ex6e7;

public class Esportivo extends Carro {
    String cor;
    String edicao;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    Esportivo(String marca, int ano, String cor, String edicao) {
        super(marca, "Esportivo", ano);
        setCor(cor);
        setEdicao(edicao);
    }
    void turbo(){
        System.out.println("Esportivo turbo");
    }
}
