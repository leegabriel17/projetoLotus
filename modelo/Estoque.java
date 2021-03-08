package modelo;

public class Estoque {
	private int estID;
	private int estoque;
	private int prodID;
	private String tipo;
	
	public Estoque(int estID, int estoque, int prodID, String tipo) {
		this.estID = estID;
		this.estoque = estoque;
		this.prodID = prodID;
		this.tipo = tipo;
	}

	protected int getEstID() {
		return estID;
	}

	protected void setEstID(int estID) {
		this.estID = estID;
	}

	protected int getEstoque() {
		return estoque;
	}

	protected void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	protected int getProdID() {
		return prodID;
	}

	protected void setProdID(int prodID) {
		this.prodID = prodID;
	}
	
	
}
