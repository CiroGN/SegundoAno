package SegundoAno.POOTreino.EstruturasDeRepeticao;

public class EstruturasRepeticao {
    public static void main(String[] args){
        // Exemplo
        // System.out.println("2 x 1 = 2");
        // System.out.println("2 x 2 = 4");
        // System.out.println("2 x 3 = 6");
        // System.out.println("2 x 4 = 8");
        // System.out.println("2 x 5 = 10");

        for(int i = 1; i <= 10; i++){
            System.out.println("2 x " + i + " = " + (2 * i));
        }

        int i = 0;
        while (i<10){
            System.out.println("Valor de i é: " + i);
            i++; //mesma coisa que i = i + 1
        }

    }
}
