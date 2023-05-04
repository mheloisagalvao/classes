
public class Tarefa {
	private String nome;
	private String descricao;
	private boolean concluida;
	private Descricao detalhes;

	public Tarefa(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.concluida = false;
		this.detalhes = new Descricao("");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public Descricao getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(Descricao detalhes) {
		this.detalhes = detalhes;
	}
}
