package TesteDeSoftware.ExercicioJava.ExercicioOO.Heranca.Ex6e7;

public class Carro extends Veiculo{
    String marca;
    String modelo;
    int ano;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    Carro(String marca, String modelo, int ano){
        super("Carro");
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    void abastecer(){
        System.out.println("Abastecendo o carro");
    }
}
