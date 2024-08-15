package CollectionList.Livraria;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	//ATRIBUTO
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
		
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPubli) {
		livroList.add(new Livro(titulo, autor, anoPubli));
	}
	
	public List<Livro> pesquisarAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l  : livroList) {
				if(l.getAnoPubli() >= anoInicial && l.getAnoPubli() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String Titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()){
			for(Livro l : livroList){
				if(l.getTitulo().equalsIgnoreCase(Titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivro = new CatalogoLivros();
		catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogoLivro.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		
		System.out.println(catalogoLivro.pesquisarAutor("Autor 1"));
		System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 4"));
		System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(1994, 2020));
	}

	
	
	
}
