package POOTreino.Heranca.exercicio;

public class Figura {
    public static void main(String[] args){
        Triangulo t1 = new Triangulo(); 
        Triangulo t2 = new Triangulo();
        
        t1.setAltura(4.0);
        t1.setLargura(4.0);
        t1.setCor("Verde");
        
        t2.setAltura(8.0);
        t2.setLargura(12.0);
        t2.setCor("Azul");

        t1.mostraDim();
        t2.mostraDim();
    }
}
