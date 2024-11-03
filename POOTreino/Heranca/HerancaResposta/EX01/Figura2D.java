public class Figura2D {
	private double largura;
	private double altura;
	
	public double getLargura(){ return largura; }
    
    public double getAltura(){ return altura; }
    
    public void setLargura(double largura){ this.largura = largura; }
    
    public void setAltura(double altura){ this.altura = altura; }
	
	public void mostrarDim(){
		System.out.println("Largura e altura: " + largura + " e " + altura);
	}
}
