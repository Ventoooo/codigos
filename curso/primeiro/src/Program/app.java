package Program;

import Entites.retangulo;
import java.util.Scanner;
import java.util.Locale;


public class app {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangulo retangulo;
		retangulo = new retangulo();
		
		System.out.print("Digite a altura do triangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.print("Digite a largura do triangulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("AREA = "+retangulo.area());
		
		System.out.println("PERIMETER = "+retangulo.perimeter());
		
		System.out.println("DIAGONAL = "+retangulo.diagonal());
		
		
		
	}

}
