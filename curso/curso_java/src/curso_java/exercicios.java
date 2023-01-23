package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicios {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o primeiro numero: ");
		
		int a, b;
		
		a = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		
		b = sc.nextInt();
		
		System.out.println("A soma dos valores resultou em: " + (a+b));
		
		sc.close();
		
	}

}
