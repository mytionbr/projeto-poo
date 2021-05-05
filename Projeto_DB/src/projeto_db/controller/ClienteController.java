
package projeto_db.controller;

import java.sql.Connection;
import java.util.List;
import projeto_db.DAO.ClienteDAO;
import projeto_db.model.Cliente;
import projeto_db.util.ConnectionFactory;


public class ClienteController {
    
    private Connection connection;
    private ClienteDAO dao;
    
    public ClienteController(){
        ConnectionFactory cf = new ConnectionFactory();
        Connection connection = cf.getConnection();
        this.connection  = connection;
        
        this.dao = new ClienteDAO(connection);
    }
    
    public void cadastra(Cliente cliente){
        dao.adiciona(cliente);
    }
    
    public List<Cliente> listar(){
        return dao.listar();
    }
    
    public void alterar(Cliente cliente){
        dao.altere(cliente);
    }
    
    public void deletar(Cliente cliente){
        dao.excluir(cliente.getCodCli());
    }
    
    public List<Cliente> buscarNome(String cliente){
       return  dao.buscar(cliente);
    }
    
    public Cliente buscarId(int id){
       return dao.buscaPorId(id);
    }
    
    public List<Cliente> buscarPor(String tipo, String valor){
        return dao.buscarPor(tipo, valor);
    }
}
