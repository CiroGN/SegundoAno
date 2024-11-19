package TesteDeSoftware.ExercicioJava.ExercicioOO.ClassesEContrutores.Ex2;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
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
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    public void imprimeCarro(){
        System.out.print("Marca: " + getMarca());
        System.out.print(" - Modelo: " + getModelo());
        System.out.println(" - Ano: " + getAno());
    }
}
