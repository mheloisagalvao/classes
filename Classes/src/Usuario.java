import java.util.List;

public class Usuario extends Cadastro {
	private List<Checklist> checklists;

	public Usuario(String nome, String email, String senha) {
		super(nome, email, senha);
		this.checklists = new ArrayList<>();
	}

	public List<Checklist> getChecklists() {
		return checklists;
	}

	public void adicionarChecklist(Checklist checklist) {
		checklists.add(checklist);
	}

	public void removerChecklist(Checklist checklist) {
		checklists.remove(checklist);
	}
}
