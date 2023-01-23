package APLICATION;

import ENTITES.TRIANGULO;
import java.util.Scanner;
import java.util.Locale;

public class PROGRAM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		TRIANGULO x, y;
		
		x = new TRIANGULO();
		y = new TRIANGULO();
		
		System.out.println("digite as dimenções do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("digite as dimenções do triangulo x: ");		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("A area de x é : %.4f%n", areax);
		System.out.printf("A area de y é : %.4f%n", areay);
		
		if ( areax > areay) {
			System.out.println("A area de x é maior");
		}
		else {
			System.out.println("a area de y é maior");
		}
		sc.close();

	}

}
