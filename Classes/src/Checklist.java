import java.util.List;

public class Checklist {
	private String nome;
	private String descricao;
	private List<Tarefa> tarefas;

	public Checklist(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.tarefas = new ArrayList<>();
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

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
	}

	public void removerTarefa(Tarefa tarefa) {
		tarefas.remove(tarefa);
	}
}
