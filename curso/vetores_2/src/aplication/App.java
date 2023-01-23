package aplication;

import java.util.Locale;
import java.util.Scanner;
import entites.Produto;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de produtos: ");
		int quantidade = sc.nextInt();
		double media = 0;
		
		Produto[] produtos = new Produto[quantidade];
		
		for (int c = 0; c < produtos.length; c++) {
			
			produtos[c] = new Produto();
			System.out.printf("%nDigite o nome do produto %d: ", (c+1));
			String name = sc.next();   
			produtos[c].setName(name);
			System.out.printf("%nDigite o preço do produto: ");
			double preco = sc.nextDouble();
			produtos[c].setPrice(preco);
			media += preco;
		}
		
		System.out.printf("%nA media dos valores dos produtos é de %.2f", (media/quantidade));
		
		
		sc.close();

	}

}
