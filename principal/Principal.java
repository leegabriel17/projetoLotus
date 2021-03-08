package principal;


import tela.TelaPrincipal;



public class Principal {

	public static void main(String[] args)  {
		
			
			javax.swing.SwingUtilities.invokeLater(new Runnable() 
	        {
	            public void run() 
	            {
	                TelaPrincipal fm = new TelaPrincipal();
	                fm.setVisible(true);
	            }
	        });
	}

}
