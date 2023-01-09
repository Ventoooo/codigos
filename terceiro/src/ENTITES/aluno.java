package ENTITES;

public class aluno {
	
	public String name;
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void resultado() {
		System.out.printf("Final grade = %.2f%n", (nota1+nota2+nota3));
		if (nota1+nota2+nota3 > 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f Points",  (nota1+nota2+nota3-60)*-1);
		}
	}
}
