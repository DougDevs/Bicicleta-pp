package NullObject;

public class Modelo {
	private String nome;
	private String cor;

	public Modelo(){}		
	
	public Modelo(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setAno(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
