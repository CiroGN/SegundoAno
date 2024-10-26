package POOTreino.Heranca.exercicio;

public class Triangulo extends Figura2D{
    private String cor;

    public double clacularArea(){
        return getLargura() * getAltura() / 2;
    }
    public void mostrarCor(){
        System.out.println("O triangulo é: " + cor);
    }
    public void setCor(String cor){
        this.cor = cor;
    }
}
