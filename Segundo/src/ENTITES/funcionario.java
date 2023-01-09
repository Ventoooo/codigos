package ENTITES;

import java.util.Scanner;

public class funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public String netSalary() {
		
		return String.format("%s , %.2f", name, (grossSalary-tax));
	}
	public void increseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100; 
	}
	
	public void calcularIdade() {
		
		Scanner sc = new Scanner(System.in);
		int dia;

		
		System.out.println("digite para testar: ");
		dia = sc.nextInt();
		System.out.println(dia);
		
		sc.close();
		
	}

}
