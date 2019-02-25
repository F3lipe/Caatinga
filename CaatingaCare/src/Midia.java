
public class Midia {
	private Foto fotos;
	private Video videos;

	public Midia(Foto fotos, Video videos) {
		super();
		this.fotos = fotos;
		this.videos = videos;
	}

	public Foto getFotos() {
		return fotos;
	}

	public void setFotos(Foto fotos) {
		this.fotos = fotos;
	}

	public Video getVideos() {
		return videos;
	}

	public void setVideos(Video videos) {
		this.videos = videos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fotos == null) ? 0 : fotos.hashCode());
		result = prime * result + ((videos == null) ? 0 : videos.hashCode());
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
		Midia other = (Midia) obj;
		if (fotos == null) {
			if (other.fotos != null)
				return false;
		} else if (!fotos.equals(other.fotos))
			return false;
		if (videos == null) {
			if (other.videos != null)
				return false;
		} else if (!videos.equals(other.videos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Midia [fotos=" + fotos + ", videos=" + videos + "]";
	}

}
