package Program;

import java.util.Scanner;

import Elements.produto;

public class estoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		produto x;
		x = new produto();

		System.out.println("Digite o nome do produtos: ");
		x.name = sc.next();

		System.out.println("Digite o preço do produtos: ");
		x.price = sc.nextDouble();
		
		System.out.println("Digite a quantidade de produtos: ");
		x.quantity = sc.nextInt();
		
		x.detalhes();
		
		int var;
		
		System.out.println("Digite a quatidade de produtos a serem inseridos");
		
		var = sc.nextInt();
		x.add_product(var);
		x.detalhes();
		
		System.out.println("Digite a quantidade de produtos a serem removidos");
		
		var = sc.nextInt();
		x.rem_product(var);
		x.detalhes();
		
		sc.close();
	}

}
