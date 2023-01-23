package Entites;

public class retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		
		return (largura*altura);
	}
	
	public double perimeter() {
		
		return (2*largura+2*altura);
	}
	
	public String diagonal() {
		
		return String.format("%.2f", (Math.sqrt(largura*largura+altura*altura)));
	}
}
