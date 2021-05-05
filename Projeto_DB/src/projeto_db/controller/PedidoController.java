
package projeto_db.controller;

import java.sql.Connection;
import java.util.List;
import projeto_db.DAO.ClienteDAO;
import projeto_db.DAO.PedidoDAO;
import projeto_db.DAO.ProdutoDAO;
import projeto_db.model.Cliente;
import projeto_db.model.Pedido;
import projeto_db.model.Produto;
import projeto_db.util.ConnectionFactory;


public class PedidoController {
    
    private Connection connection;
    private PedidoDAO dao;
    
    public PedidoController(){
        ConnectionFactory cf = new ConnectionFactory();
        Connection connection = cf.getConnection();
        this.connection  = connection;
        
        this.dao = new PedidoDAO(connection);
    }
    
    public void cadastra(Pedido pedido){
        dao.adiciona(pedido);
    }
    
    public List<Pedido> listar(){
        return dao.listar();
    }
    
    public void alterar(Pedido pedido){
        dao.altere(pedido);
    }
    
    public void deletar(Pedido pedido){
        dao.excluir(pedido.getId());
    }
 
    
    public Pedido buscarId(int id){
       return dao.buscaPorId(id);
    }
    
    
}
