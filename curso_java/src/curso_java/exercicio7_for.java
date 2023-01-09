package curso_java;

import java.util.Scanner;

public class exercicio7_for {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int s = 1; s != n+1; s ++) {
			
			System.out.printf("%d %d %d%n", s, (s*s), (s*s*s));
		}
		
		sc.close();
		
	}

}
