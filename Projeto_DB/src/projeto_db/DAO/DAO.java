/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_db.DAO;

import java.util.List;
import projeto_db.model.Elemento;

/**
 *
 * @author Lari Sousa
 */
public interface DAO {
    
    List<Elemento> lista();
    List<Elemento> buscarNome(String nome);
    List<Elemento> buscaPorId(int id);
}
