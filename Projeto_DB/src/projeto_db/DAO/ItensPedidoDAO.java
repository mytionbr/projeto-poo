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
import projeto_db.model.ItensPedido;
import projeto_db.model.Pedido;
import projeto_db.model.Produto;



public class ItensPedidoDAO {
	
	private Connection connection;

	
	
	public ItensPedidoDAO(Connection connection) {
		this.connection = connection;
              
	}
	
	public void adiciona(ItensPedido ip) {
                
		String sql = "insert into itens_ped(codped,codprod,qtd) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
                	stmt.setInt(1, ip.getCodPed());
                        stmt.setInt(2, ip.getCodProd());
                        stmt.setInt(3, ip.getQtde());
                       
                           
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
        
        public List<ItensPedido> listar(){
		
		try {
			List<ItensPedido> lip = new ArrayList<ItensPedido>();
			PreparedStatement stmt = this.connection.prepareStatement("Select * from itens_ped  ");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ItensPedido ip = new ItensPedido();
                                ip.setCodPed(rs.getInt("codPed"));
				ip.setCodProd(rs.getInt("codprod"));
                                ip.setQtde(rs.getInt("qtd"));
                                
                                lip.add(ip);
			}
			rs.close();
			stmt.close();
			return lip;
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	
	public void altere(ItensPedido ip) {
		String sql = "update itens_ped set codped=?,codprod=?,qtd=? where codped = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
                        stmt.setInt(1, ip.getCodPed());
                        stmt.setInt(2, ip.getCodProd());
                        stmt.setInt(3, ip.getQtde());
                         stmt.setInt(4, ip.getCodPed());
			
			
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public ItensPedido buscaPorId(long id) {
		ItensPedido ip = null;
		String sql = "Select * from itens_ped where codped = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ip = new ItensPedido();
                                ip.setCodPed(rs.getInt("codPed"));
				ip.setCodProd(rs.getInt("codprod"));
                                ip.setQtde(rs.getInt("qtd"));
                               
                               
										
			}
			
			return  ip;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
        
       
	
	public void excluir(int id) {
		String sql = "delete from itens_ped where codped = ?";
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

 



