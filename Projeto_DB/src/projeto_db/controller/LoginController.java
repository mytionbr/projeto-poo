

package projeto_db.controller;

import java.sql.Connection;
import projeto_db.DAO.FuncionarioDAO;
import projeto_db.model.Funcionario;
import projeto_db.util.ConnectionFactory;


public class LoginController {
    
    public Funcionario logar(String usuario, String senha){
        ConnectionFactory cf = new ConnectionFactory();
        Connection connection = cf.getConnection();
        
        FuncionarioDAO funcionarioDAO = new  FuncionarioDAO(connection);
        
        Funcionario funcionario = funcionarioDAO.buscarUsuario(usuario);
        
        if(funcionario == null){
            return null;
        }
        if(funcionario.getSenha() == senha){
            return funcionario;
        }
        return funcionario;
    }
}
