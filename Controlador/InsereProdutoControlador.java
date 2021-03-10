package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.ProdutoDao;
import modelo.Produto;
import modelo.Estoque;
import tela.Cadastro;


public class InsereProdutoControlador implements ActionListener {

	public Cadastro tela;
	public Produto modelo;
	//private Estoque modelo1;
	
	public InsereProdutoControlador(Cadastro ca) {
		this.tela = ca;
		modelo = new Produto();
		//modelo1 = new Estoque(); para Estoque
		this.tela.getBtnSalvar().addActionListener(this);
		this.tela.getBtnLimpar();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnSalvar()) {
			
			modelo.setNome(this.tela.getTfNomeProduto().getText());
			modelo.setTipo(this.tela.getTfTipo().getText());
			modelo.setValor(Float.parseFloat(this.tela.getTfValor().getText()));
			//modelo1.setEstoque(Integer parseInt(this.tela.getEstoque().getText())); //estoque
			
			ProdutoDao dao = new ProdutoDao();
			dao.salvarProduto(modelo);
		
			JOptionPane.showMessageDialog(null, "Produto inserida com Sucesso");
			
		} else if(e.getSource() == this.tela.getBtnLimpar()) {
			
			this.tela.getTfNomeProduto().setText("");
			this.tela.getTfTipo().setText("");
			this.tela.getTfValor().setText("");
			//this.tela.getTfEstoque().setText("");
			//this.tela.get fazer desmarcar os tipo do estoque
		}
	}

}

