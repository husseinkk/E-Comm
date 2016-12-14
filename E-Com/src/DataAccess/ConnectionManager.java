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
		serverPath = "jdbc:mysql://RANA/E-Comm";
	}

	/**
	 * @return
	 */
	public static Connection getConnection() {
		try {
			
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			try {
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