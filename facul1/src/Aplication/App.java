package Aplication;

import Entites.Cliente;
import Entites.Venda;
import Entites.itemVenda;
import Entites.Produto;

public class App {

	public static void main(String[] args) {
		
		Venda Venda = new Venda();
		Cliente Cliente = new Cliente("123456" , "José Maria Marques");
		
		Produto produto_01 = new Produto("Produto 01", 10.00);
		Produto produto_02 = new Produto("Produto 02", 5.00);
		Produto produto_03 = new Produto("Produto 03", 20.00);
		Produto produto_04 = new Produto("Produto 04", 15.00);
		
		itemVenda ItemVenda_01 = new itemVenda(10);
		itemVenda ItemVenda_02 = new itemVenda(5);
		itemVenda ItemVenda_03 = new itemVenda(10);
		itemVenda ItemVenda_04 = new itemVenda(2);
		

		Venda.adicionarItem(produto_01, ItemVenda_01);
		Venda.adicionarItem(produto_02, ItemVenda_02);
		Venda.adicionarItem(produto_03, ItemVenda_03);
		Venda.adicionarItem(produto_04, ItemVenda_04);
		
		Venda.listarItensVenda();
		

		
		
		
		
	}

}
