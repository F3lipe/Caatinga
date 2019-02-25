import java.util.ArrayList;

public class Perfil {

	private int Id;
	private String Nome;
	private int idade;
	private ArrayList<Publicacao> publi_pessoa;

	public Perfil(int id, String nome, int idade, ArrayList<Publicacao> publi_pessoa) {
		super();
		Id = id;
		Nome = nome;
		this.idade = idade;
		this.publi_pessoa = publi_pessoa;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Publicacao> getPubli_pessoa() {
		return publi_pessoa;
	}

	public void setPubli_pessoa(ArrayList<Publicacao> publi_pessoa) {
		this.publi_pessoa = publi_pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + idade;
		result = prime * result + ((publi_pessoa == null) ? 0 : publi_pessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (Id != other.Id)
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (idade != other.idade)
			return false;
		if (publi_pessoa == null) {
			if (other.publi_pessoa != null)
				return false;
		} else if (!publi_pessoa.equals(other.publi_pessoa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perfil [Id=" + Id + ", Nome=" + Nome + ", idade=" + idade + ", publi_pessoa=" + publi_pessoa + "]";
	}

}
