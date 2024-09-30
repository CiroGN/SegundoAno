package SegundoAno.POOTreino.EstruturasDeRepeticao;

public class ExercicioAula {
    public static void main(String[] args) {
        System.out.println("Tabuada do 5 usando for");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        System.out.println("Tabuada do 8 usando while");
        int i = 1;
        while(i <= 10) {
            System.out.println("8 x " + i + " = " + (8 * i));
            i++;
        }
        
    }

}
