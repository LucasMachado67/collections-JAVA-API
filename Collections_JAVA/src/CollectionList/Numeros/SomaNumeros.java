package CollectionList.Numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Integer> numeros;
	
	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer numero : numeros) {
			soma += numero;
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if (!numeros.isEmpty()) {
			for(Integer numero : numeros) {
				if(numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		}else {
		      throw new RuntimeException("A lista está vazia!");
	    }
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if(!numeros.isEmpty()) {
			for(Integer numero : numeros) {
				if(numero <= menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		}else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	
	public void exibirNumeros() {
		if(!numeros.isEmpty()) {
			System.out.println(this.numeros);
		}else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	
	public static void main(String[] args) {
		
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(20);
		somaNumeros.adicionarNumero(40);
		somaNumeros.adicionarNumero(57);
		somaNumeros.adicionarNumero(38);
		somaNumeros.adicionarNumero(17);
		
		System.out.println("Números adicionados");
		somaNumeros.exibirNumeros();
		
		System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
		System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
		
		
		System.out.println("A soma de todos os números é: " + somaNumeros.calcularSoma());	
	}
	
	
}
