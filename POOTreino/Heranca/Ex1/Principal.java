package POOTreino.Heranca.Ex1;

public class Principal {
    public static void main(String[] args) {
        Alimento a1 = new Alimento("Doce", 15.4, 2, "11/05/2015");
        Alimento a2 = new Alimento("Beterraba", 2.50, 1, "40/05/2015");

        Eletronico e1 = new Eletronico("Pc", 1850.15, 1, 30);
        Eletronico e2 = new Eletronico("Notebook", 1420.25, 1, 30);
        
        a1.mostrarDetalhes();
        a2.mostrarDetalhes();
        e1.mostrarDetalhes();
        e2.mostrarDetalhes();
    }
}
