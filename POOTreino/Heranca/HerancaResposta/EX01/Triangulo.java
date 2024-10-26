public class Triangulo extends Figura2D {
	private String cor;

    public double calcularArea(){
        return getLargura() * getAltura() / 2;
    }
    
    public void mostrarCor(){
        System.out.println("O triangulo e: " + cor);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}