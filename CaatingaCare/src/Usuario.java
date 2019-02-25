import java.util.ArrayList;

public class Usuario {
	private Integer id;
	private String nome;
	private ArrayList<Publicacao> comentar_publi;
	private ArrayList<Midia> midias;

	public Usuario(Integer id, String nome, ArrayList<Publicacao> comentar_publi, ArrayList<Midia> midias) {
		super();
		this.id = id;
		this.nome = nome;
		this.comentar_publi = comentar_publi;
		this.midias = midias;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Publicacao> getComentar_publi() {
		return comentar_publi;
	}

	public void setComentar_publi(ArrayList<Publicacao> comentar_publi) {
		this.comentar_publi = comentar_publi;
	}

	public ArrayList<Midia> getMidias() {
		return midias;
	}

	public void setMidias(ArrayList<Midia> midias) {
		this.midias = midias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comentar_publi == null) ? 0 : comentar_publi.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((midias == null) ? 0 : midias.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Usuario other = (Usuario) obj;
		if (comentar_publi == null) {
			if (other.comentar_publi != null)
				return false;
		} else if (!comentar_publi.equals(other.comentar_publi))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (midias == null) {
			if (other.midias != null)
				return false;
		} else if (!midias.equals(other.midias))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", comentar_publi=" + comentar_publi + ", midias=" + midias
				+ "]";
	}

}