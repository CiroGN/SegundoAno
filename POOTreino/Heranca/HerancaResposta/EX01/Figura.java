public class Figura {
	public static void main(String args[]){
		Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Retangulo r1 = new Retangulo();

        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.setCor("Verde");
        
        t2.setLargura(8.0);
        t2.setAltura(12.0);
        t2.setCor("Azul");

        r1.setAltura(2);
        r1.setLargura(4);

        System.out.println("Perimetro: " + r1.calcularPerimetro());

	}	
}
