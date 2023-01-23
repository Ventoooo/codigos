package curso_java;
import java.util.Scanner;
import java.util.Locale;

public class _2exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um numero inteiro: ");
		int x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("Não negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
	
}
