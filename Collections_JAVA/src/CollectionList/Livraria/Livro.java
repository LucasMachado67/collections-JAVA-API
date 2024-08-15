package CollectionList.Livraria;

public class Livro {
	
	
	//ATRIBUTOS
	private String titulo;
	
	private String autor;
	
	private int anoPubli;
	
	//CONSTRUTOR
	public Livro(String titulo, String autor, int anoPubli) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPubli = anoPubli;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPubli() {
		return anoPubli;
	}

	@Override
	public String toString() {
		return "Livro [Título=" + titulo + ", Autor=" + autor + ", Ano de Publicação=" + anoPubli + "]";
	}

	
	
	
}
