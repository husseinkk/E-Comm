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
			
			Class.forName("com.mysql.jdbc.Driver");

			try {
				serverPath = "jdbc:mysql://localhost:3306/e-comm?autoReconnect=true&useSSL=false";

				con = DriverManager.getConnection(serverPath , "root" , "20146007");
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