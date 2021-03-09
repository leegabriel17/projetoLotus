package modelo;

public class Produto {
	
	
	public int	ProdutoID;
	public String nome;
	public String Tipo;
	public float valor;
	
	public Produto(int produtoID, String nome, String tipo, float valor) {

		this.ProdutoID = produtoID;
		this.nome = nome;
		this.Tipo = tipo;
		this.valor = valor;
	}
	
	public Produto() {}
	
	
	public void setProdutoID(int produtoID) {
		this.ProdutoID = produtoID;
	}

	public int getProdutoID() {
		return ProdutoID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	
	
}
