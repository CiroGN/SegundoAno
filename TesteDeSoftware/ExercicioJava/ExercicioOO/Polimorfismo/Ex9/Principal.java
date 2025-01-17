package TesteDeSoftware.ExercicioJava.ExercicioOO.Polimorfismo.Ex9;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultadoInteiros = calc.somar(5, 10);
        System.out.println("Soma de dois inteiros: " + resultadoInteiros);

        double resultadoDoubles = calc.somar(5.5, 3.2);
        System.out.println("Soma de dois doubles: " + resultadoDoubles);

        double resultadoMisto = calc.somar(5, 2.5);
        System.out.println("Soma de um inteiro e um double: " + resultadoMisto);
    }
}
