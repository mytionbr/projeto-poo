
package projeto_db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
   public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/vendas?serverTimezone=UTC","root","");
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
