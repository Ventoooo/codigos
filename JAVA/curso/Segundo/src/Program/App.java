package Program;

import ENTITES.funcionario;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		funcionario funcionario;
		funcionario = new funcionario();
		
		System.out.println("Digite o nome do funcionario");
		funcionario.name = sc.next();
		System.out.println("Digite o Salario grosso do funcionario");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o imposto pago pelo funcionario");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Employee: " + funcionario.netSalary());
	
		System.out.println("Which percentage to increase salary? :");
		funcionario.increseSalary(sc.nextDouble());
		
		System.out.println("updated data: " + funcionario.netSalary());
	
		sc.close();
		
		funcionario.calcularIdade();
	
	}

}
