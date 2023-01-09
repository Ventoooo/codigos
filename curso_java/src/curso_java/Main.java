package curso_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String product_1 = "Computer";
		String product_2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price_1 = 2100.0;
		double price_2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product_1, price_1);
		System.out.printf("%s, which price is $ %.2f %n%n", product_2, price_2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
