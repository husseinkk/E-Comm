package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Controller.Course;
import Controller.Teacher;
import Controller.User;

/**
 * 
 */
public class UserDBAccess {

	static Connection currentCon = null;
	static ResultSet rs = null;

	/**
	 * Default constructor
	 */
	public UserDBAccess() {
	}

	/**
	 * 
	 */

	/**
	 * @param user
	 * @return
	 */
	public User signIn(User user) {
		Statement stmt = null;
		String Query = "select * from Users join UserTypes on Users.UserTypeID = UserTypes.UserTypeID where Username=" + user.username + " and Password = "
				+ user.password;

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();

			user.name = rs.getString("Name");
			user.usertype = rs.getString("UserType");

		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
		}

		// some exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}

		return user;
	}

	/**
	 * @param user
	 * @return
	 */
	public boolean addUser(User user) {
		// TODO implement here
		return false;
	}

	/**
	 * @param username
	 * @return
	 */
	public boolean removeUser(String username) {
		// TODO implement here
		return false;
	}

	/**
	 * @param user
	 * @return
	 */
	public boolean editUser(User user) {
		// TODO implement here
		return false;
	}

	/**
	 * @param level
	 * @return
	 */
	public User[] selectUsers(int level) {
		// TODO implement here
		return null;
	}

	/**
	 * @param userID
	 * @return
	 */
	public User selectUser(int userID) {
		// TODO implement here
		return null;
	}

	/**
	 * @param gpa
	 * @param department
	 * @return
	 */
	public User[] selectUser(float gpa, String department) {
		// TODO implement here
		return null;
	}

	/**
	 * @param course
	 * @param type
	 * @return
	 */
	public User[] selectUser(Course course, String type) {
		// TODO implement here
		return null;
	}

	/**
	 * @param user
	 * @return
	 */
	public boolean checkUser(User user) { 
		Statement stmt = null;
		String Query = "select * from Users join UserTypes on Users.UserTypeID = UserTypes.UserTypeID where Username=" + user.username + " and Password = "
				+ user.password;


		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			boolean more = rs.next();

			// if user does not exist set the isValid variable to false
			if (!more) {
				return false;
			}

			else if (more) {
				return true;
			}
		}

		catch (Exception ex) {
			System.out.println("Checking failed: An Exception has occurred! " + ex);
		}

		// some exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return false;
	}
	

	/**
	 * @param rate
	 * @param teacher
	 * @return
	 */
	public boolean rateTeacher(int rate, Teacher teacher) {
		// TODO implement here
		return false;
	}

}