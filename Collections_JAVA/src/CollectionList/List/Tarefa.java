package CollectionList.List;

public class Tarefa {
	//ATRIBUTO
	
	private String descricao;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		return "Tarefa{" +
				"descricao='" + descricao + '\'' +
				'}';
	}
	
}
