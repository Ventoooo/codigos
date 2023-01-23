package curso_java;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite 4 numeros: %n");
		
		int a, b, c, d;
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		c = sc.nextInt();
		
		d = sc.nextInt();
		
		System.out.print("Diferença = " + (a*b - c*d));
		
		
	}

}
