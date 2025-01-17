package TesteDeSoftware.ExercicioJava.ExercicioOO.Heranca.Ex5;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        System.out.println(animal.som());
        System.out.println(cachorro.som());
        System.out.println(gato.som());
    }
}
