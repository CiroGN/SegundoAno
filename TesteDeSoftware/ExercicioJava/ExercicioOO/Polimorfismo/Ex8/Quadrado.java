package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex8;

public class Quadrado extends Forma {
    double lado;
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    Quadrado(int lado){
        super("Quadrado");
        setLado(lado);
    }
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    @Override
    public String toString() {
        return "Quadrado com lado " + lado + ", área: " + calcularArea();
    }
}
