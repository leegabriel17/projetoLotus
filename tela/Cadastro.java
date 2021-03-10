package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class Cadastro extends JFrame {

	public JPanel contentPane;
	public JTextField TfNomeProduto;
	public JTextField TfTipo;
	public JTextField TfValor;
	public JTextField TfEstoque;
	public JButton BtnSalvar;
	public JButton BtnLimpar;
	public JCheckBox chckbxPeso;
	public final JCheckBox chckbxUnd = new JCheckBox("Und");

	/**
	 * Create the frame.
	 */
	public Cadastro(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 452);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(147, 10, 118, 37);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Produto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 61, 106, 28);
		getContentPane().add(lblNewLabel_1);
		
		TfNomeProduto = new JTextField();
		TfNomeProduto.setBounds(126, 62, 216, 29);
		getContentPane().add(TfNomeProduto);
		TfNomeProduto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 117, 106, 22);
		getContentPane().add(lblNewLabel_2);
		
		TfTipo = new JTextField();
		TfTipo.setBounds(126, 116, 216, 28);
		getContentPane().add(TfTipo);
		TfTipo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Valor");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 183, 106, 22);
		getContentPane().add(lblNewLabel_3);
		
		TfValor = new JTextField();
		TfValor.setBounds(126, 182, 96, 28);
		getContentPane().add(TfValor);
		TfValor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Estoque");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 231, 106, 22);
		getContentPane().add(lblNewLabel_4);
		
		TfEstoque = new JTextField();
		TfEstoque.setBounds(126, 233, 96, 22);
		getContentPane().add(TfEstoque);
		TfEstoque.setColumns(10);
		
		BtnSalvar = new JButton("Salvar");
		BtnSalvar.setBounds(80, 319, 128, 36);
		getContentPane().add(BtnSalvar);
		
		chckbxUnd.setBounds(227, 225, 48, 36);
		getContentPane().add(chckbxUnd);
		
		chckbxPeso = new JCheckBox("Peso");
		chckbxPeso.setBounds(277, 233, 48, 21);
		getContentPane().add(chckbxPeso);
		
		BtnLimpar = new JButton("Limpar");
		BtnLimpar.setBounds(277, 319, 118, 36);
		getContentPane().add(BtnLimpar);
	}

	public JTextField getTfNomeProduto() {
		return TfNomeProduto;
	}

	public void setTfNomeProduto(JTextField tfNomeProduto) {
		TfNomeProduto = tfNomeProduto;
	}

	public JTextField getTfTipo() {
		return TfTipo;
	}

	public void setTfTipo(JTextField tfTipo) {
		TfTipo = tfTipo;
	}

	public JTextField getTfValor() {
		return TfValor;
	}

	public void setTfValor(JTextField tfValor) {
		TfValor = tfValor;
	}

	public JTextField getTfEstoque() {
		return TfEstoque;
	}

	public void setTfEstoque(JTextField tfEstoque) {
		TfEstoque = tfEstoque;
	}

	public JButton getBtnSalvar() {
		return BtnSalvar;
	}

	public void setBtnSalvar(JButton btnSalvar) {
		BtnSalvar = btnSalvar;
	}

	public JButton getBtnLimpar() {
		return BtnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		BtnLimpar = btnLimpar;
	}

	public JCheckBox getChckbxUnd() {
		return chckbxUnd;
	}

		
	

}
