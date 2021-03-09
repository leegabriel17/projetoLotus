package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.*;
import modelo.Produto;

public class ProdutoDao {
	
	public Conexao con = null;

	public void salvarProduto(Produto produto) {
		
		try {
		
			this.con = Conexao.getInstance();
		
			String sql = "insert into produto (produtoID ,nome, tipo, valor) values (prod_seq.nextval ,?, ?, ?)";
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);
			pstm.setFloat(4,produto.getValor());
			pstm.setString(3, produto.getTipo());
			pstm.setString(2, produto.getNome());
			pstm.setInt(1, produto.getProdutoID());
			pstm.executeUpdate();
			
			System.out.println("Foi inserido com sucesso");
			
		} catch(SQLException e) {
			
			System.out.println("Problema ao inserir uma pessoa");
			e.printStackTrace();
		}	
	}
	
	public ArrayList<Produto> consultarTodos() {
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		try {
			
			this.con = Conexao.getInstance();
			
			String sql = "SELECT * FROM produto Order by id ";
			
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				Produto p = new Produto();
				p.setProdutoID(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setTipo(rs.getString("tipo"));
				p.setValor(rs.getFloat("valor"));
				//p.setEstoque(rs.getInt("estoque")); falta juntar a tabela estoque para mostrar junto
				//p.setTipo_e(rs.getString("tipo_e")); tipo de qtd esta no estoque;
				
				listaProdutos.add(p);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
		return listaProdutos;
	}
	
	public Produto consultarProdutoPorId(int id) {
		Produto produto = new Produto(); 
		
		try {
			
			this.con = Conexao.getInstance();
			
			String sql = "select * from produto where produtoid = ? ";
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);
			pstm.setInt(1,id);
			ResultSet rs = pstm.executeQuery();
			

			int produtoid = -1;
			String nome = "";
			String tipo = "";
			float valor = 0;
			int estoque = 0;
			
			if(rs.next()) {				
				produtoid = rs.getInt("produtoid");
				nome = rs.getString("nome");
				tipo = rs.getString("tipo");				
				valor = rs.getFloat("valor");
				//estoque = rs.getestoque("estoque"); fazer para junção com tabela estoque
				
				produto = new Produto( produtoid, nome, tipo, valor/*, estoque*/);
			}
			
			
		} catch(SQLException e) {
			
			
			e.printStackTrace();
		}
		return produto;	
	}
	
	public void editarProdutoPorId(int id, Produto produto) {
				
			try {
				this.con = Conexao.getInstance();
				
				String sql = "update produto set nome = ?, tipo = ?, valor = ? where produtoid = ? ";
				PreparedStatement pstm = con.getConnection().prepareStatement(sql);
				pstm.setInt(4, id);
				pstm.setString(1, produto.getNome());
				pstm.setString(2, produto.getTipo());
				pstm.setFloat(3, produto.getValor());
				pstm.executeUpdate();
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
	}

	public void removerProdutoPorId(int produtoid) {
		
		
		try {
			this.con = Conexao.getInstance();
			
			String sql = "delete from produto where produtoid = ? ";
			PreparedStatement pstm = con.getConnection().prepareStatement(sql);	
			pstm.setInt(1, produtoid);			
			pstm.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}



	
}