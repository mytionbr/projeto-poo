package projeto_db.DAO;


import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;
import projeto_db.model.Cliente;
import projeto_db.model.Elemento;
import projeto_db.model.Funcionario;
import projeto_db.model.Produto;



public class ProdutoDAO {
	
	private Connection connection;

	
	
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
              
	}
	
	public void adiciona(Produto produto) {
                
		String sql = "insert into produtos(descricao,preco,unidade,qtde_inicial,data_cad,qtde_atual) values (?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
                	stmt.setString(1, produto.getDescricao());
                        stmt.setDouble(2, produto.getPreco());
                        stmt.setString(3, produto.getUnidade());
                        stmt.setInt(4, produto.getQtde_inicial());
                        
                        stmt.setDate(5, new Date(produto.getData_cad().getTime()));
                        stmt.setInt(6, produto.getQtde_atual());
                        
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
        
        public List<Produto> listar(){
		
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection.prepareStatement("Select * from produtos");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Produto produto = new Produto();
                                produto.setCodProd(rs.getInt("codProd"));
				produto.setDescricao(rs.getString("descricao"));
                                produto.setPreco(rs.getDouble("preco"));
                                produto.setQtde_atual(rs.getInt("qtde_atual"));
                                produto.setQtde_inicial(rs.getInt("qtde_inicial"));
                                produto.setUnidade(rs.getString("unidade"));
                                produto.setData_cad(rs.getDate("data_cad"));
                                
                                produtos.add(produto);
			}
			rs.close();
			stmt.close();
			return produtos;
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	
	public void altere(Produto produto) {
		String sql = "update produtos set descricao=?,preco=?,unidade=?,qtde_inicial=?,data_cad=?,qtde_atual=? where codprod = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
                        stmt.setString(1, produto.getDescricao());
                        stmt.setDouble(2, produto.getPreco());
                        stmt.setString(3, produto.getUnidade());
                        stmt.setInt(4, produto.getQtde_inicial());
                        stmt.setDate(5, new Date(produto.getData_cad().getTime()));
                        stmt.setInt(6, produto.getQtde_atual());
                        stmt.setInt(7, produto.getCodProd());
			
			
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Produto buscaPorId(long id) {
		Produto Produto = null;
		String sql = "Select * from produtos where codprod = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			Produto produto = new Produto();
			while(rs.next()) {
				
                                produto.setCodProd(rs.getInt("codProd"));
				produto.setDescricao(rs.getString("descricao"));
                                produto.setPreco(rs.getDouble("preco"));
                                produto.setQtde_atual(rs.getInt("qtde_atual"));
                                produto.setQtde_inicial(rs.getInt("qtde_inicial"));
                                produto.setUnidade(rs.getString("unidade"));
                                 produto.setData_cad(rs.getDate("data_cad"));
                               
                               
										
			}
			
			return  produto;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
        
       
	
	public void excluir(int id) {
		String sql = "delete from produtos where codprod = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
        
        public List<Produto> buscar(String nome){
                List<Produto> produtos = new ArrayList<>();
                nome += "%";
		String sql = "Select * from produtos where descricao like ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Produto produto = new Produto();
                                produto.setCodProd(rs.getInt("codProd"));
				produto.setDescricao(rs.getString("descricao"));
                                produto.setPreco(rs.getDouble("preco"));
                                produto.setQtde_atual(rs.getInt("qtde_atual"));
                                produto.setQtde_inicial(rs.getInt("qtde_inicial"));
                                produto.setUnidade(rs.getString("unidade"));
                                 produto.setData_cad(rs.getDate("data_cad"));
                               
                                produtos.add(produto);
			}
			
			return  produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
        }

    long pegaIdUltimoRegistro() {
 String sql = "select LAST_INSERT_ID() produtos";
            try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			Long id = 0L; 
			while(rs.next()) {
				id = rs.getLong(1);
								
			}	
			rs.close();
			stmt.close();
			return id; 
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
        }

}

