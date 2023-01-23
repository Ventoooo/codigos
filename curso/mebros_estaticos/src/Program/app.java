package Program;

import java.util.Scanner;
import CurrencyConverter.converter;
import java.util.Locale;


public class app {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("What is the Dollar price: ");
		double Dollar = sc.nextDouble();
		
		System.out.printf("%nHow manny dollars will be bought: ");
		double quantidade = sc.nextDouble();
		
		System.out.printf("%nAmount to be paid in reais = %.2f", converter.to_dollar(quantidade, Dollar));
		
		
		sc.close();
		
		
	}

}
