package POOTreino.Encapsulamento.Encapsulamento2.ExVelocidade;

public class Carro {
    String marca;
    String modelo;
    int velocidadeAtual;
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
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        if (velocidadeAtual < 0 || velocidadeAtual > 180) {
            throw new IllegalArgumentException("Velocidade não pode ser negativa ou acima de 180");
        }
        this.velocidadeAtual = velocidadeAtual;
    }
    Carro(String marca, String modelo, int velocidadeAtual){
        setMarca(marca);
        setModelo(modelo);
        setVelocidadeAtual(velocidadeAtual);
    }
}
