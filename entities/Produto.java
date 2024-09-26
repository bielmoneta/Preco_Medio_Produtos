package entities_vetor2;

public class Produto {

	private String nome;
	private double preco;
	
	public Produto(String nome, double preço) {
		this.nome = nome;
		this.preco = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preco;
	}

	public void setPreço(double preço) {
		this.preco = preço;
	}

}
