package TesteDeSoftware.ExercicioJava.ExercicioOO.Heranca.Ex6e7;

public class Veiculo {
    String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    Veiculo(String tipo){
        setTipo(tipo);
    }
    public void mover(){
        System.out.println("O veículo está se movendo.");
    }
}
