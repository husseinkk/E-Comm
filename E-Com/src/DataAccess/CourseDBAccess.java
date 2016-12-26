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
		return false;
	}

	/**
	 * @param courseID
	 * @return
	 */
	public boolean deleteCourse(int courseID) {
		// TODO implement here
		return false;
	}

	/**
	 * @param course
	 * @param teacherID
	 * @return
	 */
	public boolean assignCourse(Course course, int teacherID) {
		// TODO implement here
		return false;
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
	public Course[] selectCourses(int studentID) {
		Statement stmt = null;
		String Query = "select * from Students join Semesters join SemestersCourses join Courses join Departments on "
				+ "Students.StudentID = Semesters.StudentID && Semesters.SemesterID = SemestersCourses.SemesterID"
				+ "&& SemestersCourses.CourseID = Courses.CourseID && Courses.DepartmentID = Departments.DepartmentID "
				+ "where Students.StudentID = " + studentID;
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
				WorkYear[] grade = GradeDBAccess.getGrade(studentID, rs.getInt("Courses.CourseID"));
				Teacher[] teachers = selectTeachers(rs.getInt("Courses.CourseID"));
				Courses[i++] = new Course (rs.getString("CourseName"), rs.getString("Description"), rs.getInt("Hours"), rs.getString("DepartmentName"), grade, teachers);
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
	
	public Teacher[] selectTeachers(int courseID) {
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