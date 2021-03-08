package modelo;

public class Produto {
	
	
	private int	ProdutoID;
	private String nome;
	private String Tipo;
	private float valor;
	
	public Produto(int produtoID, String nome, String tipo, float valor) {

		this.ProdutoID = produtoID;
		this.nome = nome;
		this.Tipo = tipo;
		this.valor = valor;
	}
	
	public Produto() {}

	protected int getProdutoID() {
		return ProdutoID;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getTipo() {
		return Tipo;
	}

	protected void setTipo(String tipo) {
		Tipo = tipo;
	}

	protected float getValor() {
		return valor;
	}

	protected void setValor(float valor) {
		this.valor = valor;
	};
	
	
}
