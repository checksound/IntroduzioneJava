package it.isisgallarate.equals;

public class Vino {
	
	private String nome;
	private int anno;
	private int prezzo;
		
	public Vino(String nome, int anno, int prezzo) {
		this.nome = nome;
		this.anno = anno;
		this.prezzo = prezzo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public int getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anno;
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
		Vino other = (Vino) obj;
		if (anno != other.anno)
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
		return "Vino [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
		
}
