package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmcadastrar = new JMenuItem("Cadastro");
		mnMenu.add(mntmcadastrar);
		
		JMenuItem mntmeditar = new JMenuItem("Gerenciar");
		mnMenu.add(mntmeditar);
		
		JMenuItem mntmlistar = new JMenuItem("Listar");
		mnMenu.add(mntmlistar);
		
		JMenuItem mntmestoque = new JMenuItem("Estoque");
		mnMenu.add(mntmestoque);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnpedido = new JButton("Pedido");
		btnpedido.setBounds(5, 5, 426, 231);
		contentPane.add(btnpedido);
	}
}
