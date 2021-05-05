
package projeto_db.controller;

import java.sql.Connection;
import java.util.List;
import projeto_db.DAO.ClienteDAO;
import projeto_db.DAO.ProdutoDAO;
import projeto_db.model.Cliente;
import projeto_db.model.Produto;
import projeto_db.util.ConnectionFactory;


public class ProdutoController {
    
    private Connection connection;
    private ProdutoDAO dao;
    
    public ProdutoController(){
        ConnectionFactory cf = new ConnectionFactory();
        Connection connection = cf.getConnection();
        this.connection  = connection;
        
        this.dao = new ProdutoDAO(connection);
    }
    
    public void cadastra(Produto produto){
        dao.adiciona(produto);
    }
    
    public List<Produto> listar(){
        return dao.listar();
    }
    
    public void alterar(Produto produto){
        dao.altere(produto);
    }
    
    public void deletar(Produto produto){
        dao.excluir(produto.getCodProd());
    }
    
    public List<Produto> buscarNome(String produto){
       return  dao.buscar(produto);
    }
    
    public Produto buscarId(int id){
       return dao.buscaPorId(id);
    }
    
    
}
