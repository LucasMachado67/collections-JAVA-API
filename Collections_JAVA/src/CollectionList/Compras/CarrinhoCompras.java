package CollectionList.Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	private List<Compra> compraList;
	
	//CONSTRUTOR
	public CarrinhoCompras() {
		this.compraList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade){
		compraList.add(new Compra(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Compra> itemsParaRemover = new ArrayList<>();
		for(Compra c : compraList) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				itemsParaRemover.add(c);
			}
		}
		compraList.removeAll(itemsParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		if(!compraList.isEmpty()) {
			for (Compra item : compraList) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirItems() {
		System.out.println(compraList);
	}
	
	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		
		carrinhoCompras.adicionarItem("Carne", 25.90 , 2);
		carrinhoCompras.adicionarItem("Maionese", 8.50 , 4);
		carrinhoCompras.adicionarItem("Morango", 17.30 , 3);
		
		carrinhoCompras.exibirItems();
		
		carrinhoCompras.removerItem("Carne");
		
		carrinhoCompras.exibirItems();
		
		System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
		
	}
}
