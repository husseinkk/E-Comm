package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */
public class ConnectionManager {
	private java.sql.Connection conn;
	public ConnectionManager() throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://localhost;databaseName=Akinator;integratedSecurity=true";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn =  DriverManager.getConnection(url);

	}
	
	public java.sql.Connection getConnection(){
		return conn;
	}

}