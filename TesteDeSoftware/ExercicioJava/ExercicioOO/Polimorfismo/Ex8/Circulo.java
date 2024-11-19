package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex8;

public class Circulo extends Forma {
    double raio;
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    Circulo(double raio){
        super("Circulo");
        setRaio(raio);
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    @Override
    public String toString() {
        return "Círculo com raio " + raio + ", área: " + calcularArea();
    }
}
