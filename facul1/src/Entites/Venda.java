package Entites;

import java.util.ArrayList;

import Entites.itemVenda;

import Entites.Cliente;

public class Venda {
	
	private String data;
	private String atendente;
	
	public ArrayList<Produto> listaDeCompras = new ArrayList<>();
	public ArrayList<itemVenda> listaDeQuantidades = new ArrayList<>();
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	
	public void adicionarItem(Produto item, itemVenda quantidade) {
		
		listaDeQuantidades.add(quantidade);
		listaDeCompras.add(item);
		System.out.println(" Adicionado Com sucesso!");
	}

	public double calcularTotal() {
		
		double c = 0;
		
		for (int i = 0; i < listaDeCompras.size(); i++) {
			c += listaDeCompras.get(i).getPreco();
		}
		return c;
		
	}
	
	public void listarItensVenda(){
		double max = 0;
		System.out.printf("%nData da Venda:");
		System.out.printf("%nCliente:  | CPF:  | idade:");
		System.out.printf("%nAtendente: %-40s","cleiton");
		System.out.printf("%nNome do produto | Preço | Quantidade | Total");
		System.out.printf("%n-----------------------------------------------------");
		for (int i = 0; i < listaDeCompras.size(); i++) {
			System.out.printf("%n%-16s|R$%5.2f|%12d| R$%8.2f", 
					listaDeCompras.get(i).getNome(),
					listaDeCompras.get(i).getPreco(),
					listaDeQuantidades.get(i).getQuantidade(),
					listaDeQuantidades.get(i).calcularTotal(listaDeCompras.get(i).getPreco()));
			max += listaDeQuantidades.get(i).calcularTotal(listaDeCompras.get(i).getPreco());
		}
		System.out.printf("%n-----------------------------------------------------");
		System.out.printf("%nTotal da Venda:%34.2f", max);


	}
	
}
