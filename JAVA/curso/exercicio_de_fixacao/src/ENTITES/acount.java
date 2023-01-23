package ENTITES;

public class acount {
	
	private int number;
	private String name;
	private double saldo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void saque(double valor) {
		saldo -= valor + 5;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void mostrarDados() {
		System.out.printf("%nO numero da conta é: %d%n"
				+ "O nome do usuário é: %s%n"
				+ "O saldo da conta é de: %.2fR$ %n", number, name, saldo);
	}
	
	public acount(int acountNumber, String name) {
		this.number = acountNumber;
		this.name = name;
	}
	

}
