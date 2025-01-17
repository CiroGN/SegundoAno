package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex8;

abstract class Forma {
    String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    Forma(String tipo){
        setTipo(tipo);
    }
    public abstract double calcularArea();
}
