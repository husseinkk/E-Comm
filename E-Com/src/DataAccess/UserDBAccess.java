
package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Controller.Course;
import Controller.Student;
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
		String Query = "select * from Users join UserTypes on Users.UserTypeID = UserTypes.UserTypeID where Username= \""
				+ user.username + "\" and Password = \"" + user.password + "\"";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			user.userID = rs.getInt("UserID");
			user.name = rs.getString("Name");
			user.usertype = rs.getString("UserType");

		}

		catch (Exception ex) {
			System.out.println("Log In failed: An Exception has occurred! " + ex);
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
		return user;
	}

	public boolean checkUser(User user) {
		Statement stmt = null;
		String Query = "select * from Users join UserTypes on Users.UserTypeID = UserTypes.UserTypeID where Username= \""
				+ user.username + "\" and Password = \"" + user.password + "\"";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			boolean more = rs.next();

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

	public boolean isUser(User user) {
		Statement stmt = null;
		String Query = "select * from Users where Username= \"" + user.username + "\"";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			boolean more = rs.next();

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
	 * @param user
	 * @return
	 */
	public int addUser(User user) {
		// TODO implement here
		Statement stmt = null;
		Statement stmt2 = null;
		int userID;
		String Query = "select UserTypeID from UserTypes where UserType = \"" + user.usertype + "\" ";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt2 = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int id = rs.getInt("UserTypeID");
			Query = "insert into Users (Username, Password, Name, UserTypeID) values ( \"" + user.username + "\", \""
					+ user.password + "\", \"" + user.name + "\", " + id + ")";
			stmt2.executeUpdate(Query ,Statement.RETURN_GENERATED_KEYS);
			rs = stmt2.getGeneratedKeys();
			rs.next();
			userID = rs.getInt(1);
		}

		catch (Exception ex) {
			System.out.println("AddUser failed: An Exception has occurred! " + ex);
			return -1;
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
		return userID;
	}

	public boolean addStudent(Student st) {
		// TODO implement here
		Statement stmt = null;
		String Query = "select DepartmentID from Departments where DepartmentName = \"" + st.dept + "\" ";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int id = rs.getInt("DepartmentID");
			Query = "insert into Students (DepartmentID , UserID , StudentID) values ( " + id + ", "
					+ st.userID + ", " + st.studID + ")";
			stmt.executeUpdate(Query);

		}

		catch (Exception ex) {
			System.out.println("AddStudent failed: An Exception has occurred! " + ex);
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

	public boolean addTeacher(Teacher t) {
		// TODO implement here
		Statement stmt = null;
		String Query = "select DepartmentID from Departments where DepartmentName = \"" + t.dept + "\" ";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int id = rs.getInt("DepartmentID");
			Query = "insert into Teachers (DepartmentID , UserID) values ( " + id + ", "
					+ t.userID + ")";
			stmt.executeUpdate(Query);

		}

		catch (Exception ex) {
			System.out.println("AddTeacher failed: An Exception has occurred! " + ex);
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
	 * @param username
	 * @return
	 */
	public boolean removeUser(String username) {
		// TODO implement here
		Statement stmt = null;
		System.out.println(username);
		String Query = "delete from Users where Username = \"" + username + "\"";

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(Query);
		}

		catch (Exception ex) {
			System.out.println("RemoveUser failed: An Exception has occurred! " + ex);
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
	 * @param user
	 * @return
	 */
	public boolean editUser(User user) {
		// TODO implement here
		Statement stmt = null;
		String Query = null;
		if (user.name != "") {
			Query = "update Users set Password = \"" + user.password + "\" , Name = \"" + user.name + "\""
					+ " where Username = \"" + user.username + "\"";
		} else {			
			Query = "update Users set Password = \"" + user.password + "\" where Username = \"" + user.username + "\"";
		}

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(Query);
		}

		catch (Exception ex) {
			System.out.println("EditUser failed: An Exception has occurred! " + ex);
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
	public Student[] selectStudents (float GPA , String Department) {
		Statement stmt = null;
		String Query = "select * from Students join Departments on Students.DepartmentID = Departments.DepartmentID"
				+ " where Students.GPA >= " + GPA + "&& Departments.DepartmentName = \"" + Department+ "\"";
		Student[] students = null;

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.last();
			students = new Student[rs.getRow()];
			rs.beforeFirst();
			int i = 0 ;
			while (rs.next()) {
				students[i++] = new Student (rs.getInt("StudentID"));
			}
		}

		catch (Exception ex) {
			System.out.println("SelectStudents failed: An Exception has occurred! " + ex);
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
		return students;
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
	 * @param rate
	 * @param teacher
	 * @return
	 */
	public boolean rateTeacher(int rate, Teacher teacher) {
		// TODO implement here
		return false;
	}
}

