
public class Seguir {
	private Usuario usuario1;
	private Usuario usuario2;

	public Seguir(Usuario usuario1, Usuario usuario2) {
		super();
		this.usuario1 = usuario1;
		 this.usuario2 = usuario2; 
	}

	public Usuario getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	public Usuario getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario1 == null) ? 0 : usuario1.hashCode());
		result = prime * result + ((usuario2 == null) ? 0 : usuario2.hashCode());
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
		Seguir other = (Seguir) obj;
		if (usuario1 == null) {
			if (other.usuario1 != null)
				return false;
		} else if (!usuario1.equals(other.usuario1))
			return false;
		if (usuario2 == null) {
			if (other.usuario2 != null)
				return false;
		} else if (!usuario2.equals(other.usuario2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seguir [usuario1=" + usuario1 + ", usuario2=" + usuario2 + "]";
	}
 }
