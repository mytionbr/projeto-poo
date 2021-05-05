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
import projeto_db.model.Pedido;
import projeto_db.model.Produto;



public class PedidoDAO {
	
	private Connection connection;

	
	
	public PedidoDAO(Connection connection) {
		this.connection = connection;
              
	}
	
	public void adiciona(Pedido pedido) {
                
		String sql = "insert into pedidos(codCliente,data) values (?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
                	stmt.setInt(1, pedido.getCodCli());
                                               
                        stmt.setDate(2, new Date(pedido.getData().getTime()));
                           
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
        
        public List<Pedido> listar(){
		
		try {
			List<Pedido> pedidos = new ArrayList<Pedido>();
			PreparedStatement stmt = this.connection.prepareStatement("Select * from pedidos");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Pedido pedido = new Pedido();
                                pedido.setCodCli(rs.getInt("codCliente"));
				pedido.setData(rs.getDate("data"));
                                pedido.setId(rs.getInt("codped"));
                                
                                pedidos.add(pedido);
			}
			rs.close();
			stmt.close();
			return pedidos;
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	
	public void altere(Pedido pedido) {
		String sql = "update pedidos set codCliente =?, data=? where codped = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
                        stmt.setInt(1, pedido.getCodCli()); 
                        stmt.setDate(2, new Date(pedido.getData().getTime()));
                        stmt.setInt(3, pedido.getId());
			
			
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Pedido buscaPorId(long id) {
		Pedido pedido = null;
		String sql = "Select * from pedidos where codped = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				pedido = new Pedido();
                                pedido.setCodCli(rs.getInt("codCliente"));
				pedido.setData(rs.getDate("data"));
                                pedido.setId(rs.getInt("codped"));
                               
                               
										
			}
			
			return  pedido;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
        
       
	
	public void excluir(int id) {
		String sql = "delete from pedidos where codped = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
        
    
        }

 



