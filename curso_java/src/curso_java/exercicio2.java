package curso_java;

import java.util.Scanner;
import java.util.Locale;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		
		double pi = 3.14159;
		
		double raio;
		
		raio = sc.nextDouble();
		
		System.out.printf("O valor do raio era de : %.4f %nPortanto a area desse circulo é de %.4f", raio, (raio*raio)*pi);
		
		
		
		sc.close();
		
	}
	

}
