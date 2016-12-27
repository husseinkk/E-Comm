package DataAccess;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import Controller.Course;
import Controller.Teacher;
import Controller.WorkYear;

/**
 * 
 */
public class CourseDBAccess {

	/**
	 * Default constructor
	 */
	public CourseDBAccess() {
	}

	/**
	 * 
	 */
	static Connection currentCon = null;
	static ResultSet rs = null;

	/**
	 * @param course
	 * @return
	 */
	public boolean addCourse(Course course) {
		// TODO implement here
		Statement stmt = null;
		
		String Query = "select * from Departments where DepartmentName = \"" + course.getDept() + "\"";
		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int dept = rs.getInt("DepartmentID");
			Query ="insert into Courses (CourseName, Description, Hours, DepartmentID) values (\"" 
					+ course.getCourseName() + "\" , \"" + course.getCourseDescription() + "\", " 
					+ course.getHours() + ", " + dept + ")";
			stmt.executeUpdate(Query);
			}

		catch (Exception ex) {
			System.out.println("AddCourses failed: An Exception has occurred! " + ex);
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
	 * @param courseID
	 * @return
	 */
	public boolean deleteCourse(String courseName) {
		// TODO implement here
		Statement stmt = null;
		String Query = "delete from Courses where CourseName = \"" + courseName + "\"";
		System.out.println(courseName);

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			stmt.executeUpdate(Query);
		}

		catch (Exception ex) {
			System.out.println("DeleteCourse failed: An Exception has occurred! " + ex);
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
	 * @param course
	 * @param teacherID
	 * @return
	 */
	public boolean assignCourse(String courseName, String teacherName) {
		// TODO implement here
		Statement stmt = null;
		String Query = "select CourseID from Courses where CourseName = \"" + courseName +"\"" ; 
		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int cID = rs.getInt("CourseID");
			Query = "select TeacherID from Users join Teachers on Users.UserID = Teachers.UserID where Name = \"" + teacherName +"\"" ;
			rs = stmt.executeQuery(Query);
			rs.next();
			int tID = rs.getInt("TeacherID");
			Query = "insert into CoursesTeachers (CourseID, TeacherID) values (" + cID +", " + tID + ")";
			stmt.executeUpdate(Query);
			}

		catch (Exception ex) {
			System.out.println("AssignCourses failed: An Exception has occurred! " + ex);
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
	 * @param courseID
	 * @param semesterNo
	 * @param studID
	 * @return
	 */
	public boolean registerCourse(int courseID, int semesterNo, int studID) {
		// TODO implement here
		return false;
	}

	/**
	 * @param courseID
	 * @param studID
	 * @return
	 */
	public boolean dropCourse(int courseID, int studID) {
		// TODO implement here
		return false;
	}

	/**
	 * @return
	 */
	public Set<Course> selectCourses() {
		// TODO implement here
		return null;
	}

	/**
	 * @param studentID
	 * @param semesterNo
	 * @return
	 */
	public Set<Course> selectCourses(int studentID, int semesterNo) {
		// TODO implement here
		return null;
	}

	/**
	 * @param studentID
	 * @return
	 */
	public static Course[] selectCourses(int userID) {
		Statement stmt = null;
		String Query = "select * from Users join Students join Semesters join SemestersCourses join Courses "
				+ "join Departments on Users.UserID = Students.UserID && Students.StudentID = Semesters.StudentID "
				+ "&& Semesters.SemesterID = SemestersCourses.SemesterID && SemestersCourses.CourseID = Courses.CourseID"
				+ " && Courses.DepartmentID = Departments.DepartmentID where Students.UserID = " + userID;
		Course[] Courses = null;

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.last();
			Courses = new Course[rs.getRow()];
			rs.beforeFirst();
			int i = 0;
			while (rs.next()) {
				WorkYear[] grade = GradeDBAccess.getGrade(rs.getInt("StudentID"), rs.getInt("CourseID"));
				Teacher[] teachers = selectTeachers(rs.getInt("CourseID"));
				Courses[i++] = new Course (i, rs.getString("CourseName"), rs.getString("Description"), rs.getInt("Hours"), rs.getString("DepartmentName"), grade, teachers);
			}
		}

		catch (Exception ex) {
			System.out.println("GettingCourses failed: An Exception has occurred! " + ex);
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

		return Courses;

	}
	
	public static Teacher[] selectTeachers(int courseID) {
		Statement stmt = null;
		ResultSet r = null;
		String Query = "select * from CoursesTeachers join Teachers Join Users "
				+ "on CoursesTeachers.TeacherID = Teachers.TeacherID && Teachers.UserID = Users.UserID "
				+ "where CoursesTeachers.CourseID = " + courseID ;
		Teacher[] Teachers = null;

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			r = stmt.executeQuery(Query);
			r.last();
			Teachers = new Teacher[r.getRow()];
			r.beforeFirst();
			int i = 0;
			while (r.next()) {
				Teachers[i++] = new Teacher (r.getString("Name"), r.getInt("Rate"));
			}
		}

		catch (Exception ex) {
			System.out.println("GettingTeachers failed: An Exception has occurred! " + ex);
		}

		// some exception handling
		try {
			if (r != null) {
				r.close();
				r = null;
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

		return Teachers;
	}
}