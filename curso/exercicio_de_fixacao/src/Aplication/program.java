package Aplication;

import java.util.Scanner;
import ENTITES.acount;
import java.util.Locale;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("%nEnter account name: ");
		String name = sc.nextLine();
		
		acount acount = new acount(number, name);
		
		System.out.printf("%nIs there an initial deposit (y/n): ");
		
		char flag = sc.next().charAt(0);

		while (flag != 'n') {
		if (flag == 'y') {
			System.out.printf("%nDigite o valor do deposito: ");
			double valor = sc.nextDouble();
			acount.deposito(valor);
			acount.mostrarDados();
			flag = 'n';
		}
		else if (flag == 'n') {
			acount.mostrarDados();
		}
		else {
			System.out.printf("%n!!Dados invalidos, digite novamente!!");
			flag = sc.next().charAt(0);
		}
		}
		
		
		
		System.out.printf("%nEnter a deposit value: ");
		acount.deposito(sc.nextDouble());
		acount.mostrarDados();
		
		System.out.printf("%nEnter a withdraw value: ");
		acount.saque(sc.nextDouble());
		acount.mostrarDados();
		
		sc.close();
		
	}

}
