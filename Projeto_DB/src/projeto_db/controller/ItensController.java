
package projeto_db.controller;

import java.sql.Connection;
import java.util.List;
import projeto_db.DAO.ClienteDAO;
import projeto_db.DAO.ItensPedidoDAO;
import projeto_db.DAO.PedidoDAO;
import projeto_db.DAO.ProdutoDAO;
import projeto_db.model.Cliente;
import projeto_db.model.ItensPedido;
import projeto_db.model.Pedido;
import projeto_db.model.Produto;
import projeto_db.util.ConnectionFactory;


public class ItensController {
    
    private Connection connection;
    private ItensPedidoDAO dao;
    
    public ItensController(){
        ConnectionFactory cf = new ConnectionFactory();
        Connection connection = cf.getConnection();
        this.connection  = connection;
        
        this.dao = new ItensPedidoDAO(connection);
    }
    
    public void cadastra(ItensPedido pedido){
        dao.adiciona(pedido);
    }
    
    public List<ItensPedido> listar(){
        return dao.listar();
    }
    
    public void alterar(ItensPedido pedido){
        dao.altere(pedido);
    }
    
    public void deletar(ItensPedido pedido){
        dao.excluir(pedido.getCodPed());
    }
 
    
    public ItensPedido buscarId(int id){
       return dao.buscaPorId(id);
    }

    
    
    
}
