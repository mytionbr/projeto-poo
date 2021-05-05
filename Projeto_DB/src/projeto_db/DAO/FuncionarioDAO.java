package projeto_db.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto_db.model.Elemento;
import projeto_db.model.Funcionario;



public class FuncionarioDAO implements DAO{
	
	private Connection connection;

	
	
	public FuncionarioDAO(Connection connection) {
		this.connection = connection;
              
	}
        public List<Elemento>lista(){
            return new ArrayList<Elemento>();
        }
	
	public void adiciona(Funcionario funcionario) {
                
		String sql = "insert into funcionarios (usuario,senha,nome,cpf) values (?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getUsuario());
			stmt.setString(2,funcionario.getSenha());
			stmt.setString(3, funcionario.getNome());
                        stmt.setString(4, funcionario.getCpf());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altere(Funcionario funcionario) {
		String sql = "update funcionarios set usuario=?, senha=?, nome=?, cpf=? where id =?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1,funcionario.getUsuario());
			stmt.setString(2, funcionario.getSenha());
			stmt.setString(3, funcionario.getNome());
                        stmt.setString(4, funcionario.getCpf());
                        stmt.setLong(5, funcionario.getId());
			
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Funcionario buscaPorId(long id) {
		Funcionario funcionario = null;
		String sql = "Select * from funcionarios where id = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				funcionario = new Funcionario();
                                funcionario.setId(rs.getInt("id"));
                                funcionario.setCpf(rs.getString("cpf"));
                                funcionario.setNome(rs.getString("nome"));
                                funcionario.setSenha(rs.getString("senha"));
                                funcionario.setUsuario(rs.getString("usuario"));
                               
										
			}
			
			return  funcionario;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void excluir(long id) {
		String sql = "delete from funcionarios where id = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
        
        public Funcionario buscarUsuario(String usuario){
            Funcionario funcionario = null;
		String sql = "Select * from funcionarios where usuario = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario);
			stmt.execute();
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				funcionario = new Funcionario();
                                funcionario.setId(rs.getInt("id"));
                                funcionario.setCpf(rs.getString("cpf"));
                                funcionario.setNome(rs.getString("nome"));
                                funcionario.setSenha(rs.getString("senha"));
                                funcionario.setUsuario(rs.getString("usuario"));
                               
										
			}
			
			return  funcionario;
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

    @Override
    public List<Elemento> buscarNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Elemento> buscaPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	    }

