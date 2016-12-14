package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 */
public class ConnectionManager {

	static String serverPath;
	static Connection con;

	/**
	 * Default constructor
	 */
	public ConnectionManager() {
		serverPath = "jdbc:sqlserver://[RANA[\\E-Com]";
	}

	/**
	 * @return
	 */
	public static Connection getConnection() {
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			try {
				serverPath = "jdbc:sqlserver://RANA;databaseName=E-Comm;;integratedSecurity=true;";
				con = DriverManager.getConnection(serverPath);
			}

			catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

		catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		return con;
	}

	/**
     * @return
     */
    public void closeConnection() {
        // TODO implement here
    }

}