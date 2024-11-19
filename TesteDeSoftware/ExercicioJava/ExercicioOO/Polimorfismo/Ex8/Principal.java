package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex8;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5));
        formas.add(new Quadrado(4));
        formas.add(new Circulo(2.5));
        formas.add(new Quadrado(6));

        // Calculando as áreas de todas as formas usando polimorfismo
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
