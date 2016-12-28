package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */
public class NotificationDBAccess {

    /**
     * Default constructor
     */
    public NotificationDBAccess() {
    }

    /**
     * 
     */
    static Connection currentCon = null;
	static ResultSet rs = null;


    /**
     * @param notif 
     * @param student 
     * @return
     */
    public boolean addNotification(String nDescr, int studentID) {
        // TODO implement here
    	Statement stmt = null;
		String Query = "insert into Notifications (Description, StudentID) values (\"" + nDescr + "\", " + studentID + ")";
		System.out.println(Query);
		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(Query);
		}

		catch (Exception ex) {
			System.out.println("AddNotifications failed: An Exception has occurred! " + ex);
			return false;
		}

		// some exception handling
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (currentCon != null) {
				currentCon.close();
				currentCon = null;
			}
		} catch (Exception e) {

		}
		return true;
    }

    /**
     * @param studID 
     * @return
     */
    public Set<Notification> getNotifications(int studID) {
        // TODO implement here
        return null;
    }

    /**
     * @param studID 
     * @param nID 
     * @return
     */
    public boolean removeNotification(int studID, int nID) {
        // TODO implement here
        return false;
    }

}