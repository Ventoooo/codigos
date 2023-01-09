package Aplication;

import ENTITES.aluno;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		aluno aluno;
		aluno = new aluno();
		System.out.printf("%nDigite o nome do aluno: ");
		aluno.name = sc.nextLine();
		
		System.out.printf("%nDigite a 1ª nota do aluno: ");
		aluno.nota1 = sc.nextDouble();
		System.out.printf("%nDigite a 2ª nota do aluno: ");
		aluno.nota2 = sc.nextDouble();
		System.out.printf("%nDigite a 3ª nota do aluno: ");
		aluno.nota3 = sc.nextDouble();
		
		aluno.resultado();
		
		sc.close();

	}

}
