package curso_java;
import java.util.Locale;
import java.util.Scanner;


public class _2exercicio4 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora de inicio: ");
		
		int inicio = sc.nextInt();
		
		System.out.println("Hora do termino: ");
		
		int termino = sc.nextInt();
		
		if (inicio > termino) {
			System.out.println("O jogo durou: " + (-1*inicio+24 + termino) + " Horas");
		}
		else if (inicio == termino) {
			System.out.println("O jogo durou: 24 horas");
		}
		else if (inicio < termino) {
			System.out.println("O jogo durou: " + (termino - inicio) + " Horas");
		}
	}
}
