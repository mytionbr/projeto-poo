
package projeto_db.model;

import java.util.List;
import projeto_db.DAO.DAO;


public interface Estrategia {
    List<Elemento> executa(DAO dao);
}
