package aplication;
import java.util.Scanner;
import java.util.Locale;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a quantidade de numeros: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("%ndigite o " + (i+1) + "ª valor: ");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		System.out.printf("%nA media dos valores foi de: %.2f", (media/n));
		
		
		
		sc.close();

	}

}
