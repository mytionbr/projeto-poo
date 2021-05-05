package projeto_db.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto_db.model.Cliente;
import projeto_db.model.Elemento;
import projeto_db.model.Funcionario;



public class ClienteDAO {
	
	private Connection connection;

	
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
              
	}
	
	public void adiciona(Cliente cliente) {
                
		String sql = "insert into clientes (nome,endereco,bairro,cidade,cep,uf,fone,celular,email) values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
                	stmt.setString(1, cliente.getNome());
                        stmt.setString(2, cliente.getEndereco());
                        stmt.setString(3, cliente.getBairro());
                        stmt.setString(4, cliente.getCidade());
                        stmt.setString(5, cliente.getCep());
                        stmt.setString(6, cliente.getUf());
                        stmt.setString(7, cliente.getTelefone());
                        stmt.setString(8, cliente.getCelular());
                        stmt.setString(9, cliente.getEmail());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
        
        public List<Cliente> listar(){
		
		try {
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = this.connection.prepareStatement("Select * from clientes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				  cliente.setCodCli(rs.getInt("codcli"));
                                cliente.setBairro(rs.getString("bairro"));
                                cliente.setNome(rs.getString("nome"));
                                cliente.setEmail(rs.getString("email"));
                                cliente.setEndereco(rs.getString("endereco"));
                                cliente.setCelular(rs.getString("celular"));
                                cliente.setTelefone(rs.getString("fone"));
                                cliente.setUf(rs.getString("uf"));
                                cliente.setCep(rs.getString("cep"));
                                cliente.setCidade(rs.getString("cidade"));
                                
                                clientes.add(cliente);
			}
			rs.close();
			stmt.close();
			return clientes;
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}
	}
	
	public void altere(Cliente cliente) {
		String sql = "update clientes set nome=?, endereco=?, bairro=?, cidade=?, cep=?, uf=?, fone=?,celular=?,email=? where codcli =?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1,cliente.getNome());
			stmt.setString(2, cliente.getEndereco());
			stmt.setString(3, cliente.getBairro());
                        stmt.setString(4, cliente.getCidade());
                        stmt.setString(5, cliente.getCep());
                        stmt.setString(6, cliente.getUf());
                        stmt.setString(7, cliente.getTelefone());
                        stmt.setString(8, cliente.getCelular());
                        stmt.setString(9, cliente.getEmail());
			stmt.setInt(10, cliente.getCodCli());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Cliente buscaPorId(long id) {
		Cliente cliente = null;
		String sql = "Select * from clientes where codcli = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				cliente = new Cliente();
                                cliente.setCodCli(rs.getInt("codcli"));
                                cliente.setBairro(rs.getString("bairro"));
                                cliente.setNome(rs.getString("nome"));
                                cliente.setEmail(rs.getString("email"));
                                cliente.setEndereco(rs.getString("endereco"));
                                cliente.setCelular(rs.getString("celular"));
                                cliente.setTelefone(rs.getString("fone"));
                                cliente.setUf(rs.getString("uf"));
                                cliente.setCep(rs.getString("cep"));
                                cliente.setCidade(rs.getString("cidade"));
                               
										
			}
			
			return  cliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void excluir(int id) {
		String sql = "delete from clientes where codcli = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
        
        public List<Cliente> buscar(String nome){
                List<Cliente> clientes = new ArrayList<>();
                nome += "%";
		String sql = "Select * from clientes where nome like ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodCli(rs.getInt("codcli"));
                                cliente.setBairro(rs.getString("bairro"));
                                cliente.setNome(rs.getString("nome"));
                                cliente.setEmail(rs.getString("email"));
                                cliente.setEndereco(rs.getString("endereco"));
                                cliente.setCelular(rs.getString("celular"));
                                cliente.setTelefone(rs.getString("fone"));
                                cliente.setUf(rs.getString("uf"));
                                cliente.setCep(rs.getString("cep"));
                                cliente.setCidade(rs.getString("cidade"));
                                
                                clientes.add(cliente);
			}
			
			return  clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
        }
        
        public List<Cliente> buscarPor(String tipo, String valor){
                List<Cliente> clientes = new ArrayList<>();
                valor += "%";
		String sql = "Select * from clientes where "+tipo+" like ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, valor);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodCli(rs.getInt("codcli"));
                                cliente.setBairro(rs.getString("bairro"));
                                cliente.setNome(rs.getString("nome"));
                                cliente.setEmail(rs.getString("email"));
                                cliente.setEndereco(rs.getString("endereco"));
                                cliente.setCelular(rs.getString("celular"));
                                cliente.setTelefone(rs.getString("fone"));
                                cliente.setUf(rs.getString("uf"));
                                cliente.setCep(rs.getString("cep"));
                                cliente.setCidade(rs.getString("cidade"));
                                
                                clientes.add(cliente);
			}
			
			return  clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
        }

    long pegaIdUltimoRegistro() {
 String sql = "select LAST_INSERT_ID() funcioarios";
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

