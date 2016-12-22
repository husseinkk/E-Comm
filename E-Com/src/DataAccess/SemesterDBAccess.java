package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Controller.Semester;

/**
 * 
 */
public class SemesterDBAccess {

	/**
	 * Default constructor
	 */
	public SemesterDBAccess() {
	}

	/**
	 * 
	 */
	static Connection currentCon = null;
	static ResultSet rs = null;

	/**
	 * @param studID
	 * @param number
	 * @return
	 */
	public boolean addSemester(int studID, int number) {
		// TODO implement here
		Statement stmt = null;
		String Query = "insert into Semesters (StudentID , Number) values (" + studID + ", " + number + ")";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(Query);
		}

		catch (Exception ex) {
			System.out.println("AddSemester failed: An Exception has occurred! " + ex);
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

		return false;
	}

	/**
	 * @param studID
	 * @param number
	 * @return
	 */
	public Semester getSemester(int studID, int number) {
		// TODO implement here
		return null;
	}

	/**
	 * @param studID
	 * @param number
	 * @return
	 */
	public boolean removeSemester(int studID, int number) {
		// TODO implement here
		return false;
	}

}