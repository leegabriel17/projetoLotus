package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.ProdutoDao;
import modelo.Produto;
import modelo.Estoque;
import tela.Cadastro;


public class InsereProdutoControlador implements ActionListener {

	private Cadastro tela;
	private Produto modelo;
	private Estoque modelo1;
	
	public InsereProdutoControlador(Cadastro ca) {
		this.tela = ca;
		modelo = new Produto();
		//modelo1 = new Estoque(); para Estoque
		this.tela.getBtnSalvar().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.tela.getBtnSalvar()) {
			
			modelo.setNome(this.tela.getTfNomeProduto().getText());
			modelo.setTipo(this.tela.getTfTipo().getText());
			modelo.setValor(this.tela.getTfValor().getText());
			//modelo1.setEstoque(Integer parseInt(this.tela.getEstoque().getText())); //estoque
			
			ProdutoDao dao = new ProdutoDao();
			dao.salvarPessoa(modelo);
		
			JOptionPane.showMessageDialog(null, "Pessoa inserida com Sucesso");
			
		} else if(e.getSource() == this.tela.getBtnLimpar()) {
			
			this.tela.getTfNome().setText("");
			this.tela.getTfTipo().setText("");
			this.tela.getTfValor().setText("");
			this.tela.getTfEstoque().setText("");
			//this.tela.get fazer desmarcar os tipo do estoque
		}
	}

}

