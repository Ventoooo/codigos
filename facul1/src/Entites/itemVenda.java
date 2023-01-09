package Entites;

import Entites.Venda;

public class itemVenda {

	private int quantidade;
	
	
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double calcularTotal(double preco) {
		
		return ( quantidade * preco);
	}

	public itemVenda(int quantidade) {
		this.quantidade = quantidade;
	}

}
