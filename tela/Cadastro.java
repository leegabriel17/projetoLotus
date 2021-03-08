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
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeProduto;
	private JTextField tfTipo;
	private JTextField tfValor;
	private JTextField tfEstoque;
	private final JButton btnSalvar = new JButton("Salvar");
	private final JCheckBox chckbxUnd = new JCheckBox("Und");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(147, 10, 118, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do Produto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 61, 106, 28);
		contentPane.add(lblNewLabel_1);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setBounds(126, 62, 216, 29);
		contentPane.add(tfNomeProduto);
		tfNomeProduto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 117, 106, 22);
		contentPane.add(lblNewLabel_2);
		
		tfTipo = new JTextField();
		tfTipo.setBounds(126, 116, 216, 28);
		contentPane.add(tfTipo);
		tfTipo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Valor");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 183, 106, 22);
		contentPane.add(lblNewLabel_3);
		
		tfValor = new JTextField();
		tfValor.setBounds(126, 182, 96, 28);
		contentPane.add(tfValor);
		tfValor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Estoque");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 231, 106, 22);
		contentPane.add(lblNewLabel_4);
		
		tfEstoque = new JTextField();
		tfEstoque.setBounds(126, 233, 96, 22);
		contentPane.add(tfEstoque);
		tfEstoque.setColumns(10);
		btnSalvar.setBounds(80, 319, 128, 36);
		contentPane.add(btnSalvar);
		chckbxUnd.setBounds(227, 225, 48, 36);
		contentPane.add(chckbxUnd);
		
		JCheckBox chckbxPeso = new JCheckBox("Peso");
		chckbxPeso.setBounds(277, 233, 48, 21);
		contentPane.add(chckbxPeso);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(277, 319, 118, 36);
		contentPane.add(btnLimpar);
	}
}
