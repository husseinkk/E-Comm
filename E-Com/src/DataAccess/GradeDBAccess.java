package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import Controller.Grade;

/**
 * 
 */
public class GradeDBAccess {

    /**
     * Default constructor
     */
    public GradeDBAccess() {
    }

    /**
     * 
     */
    static Connection currentCon = null;
	static ResultSet rs = null;


    /**
     * @param grade 
     * @param studID 
     * @return
     */
    public boolean addGrade(Grade grade, int studID) {
        // TODO implement here
        return false;
    }

    /**
     * @param grade 
     * @param studID 
     * @return
     */
    public boolean editGrade(Grade grade, int studID) {
        // TODO implement here
        return false;
    }

    /**
     * @param studID 
     * @param courseID 
     * @return
     */
    public Grade getGrade(int studID, int courseID) {
        // TODO implement here
    	Statement stmt = null;
    	String Query = "select SCID from  Students join Semesters join SemestersCourses on"
				+ "	Students.StudentID = Semesters.StudentID && Semesters.SemesterID = SemestersCourses.SemesterID"
    			+ " where Students.StudentID = " + studID  + "&& SemestersCourses.CourseID = " + courseID ;

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int SCID = rs.getInt("SCID");
			Query = "select * from WorkYears join WorkTypes on WorkYears.WorkTypeID = WorkTypes.WorkTypeID "
					+ "where WorkYears.SCID = " + SCID;
			rs = stmt.executeQuery(Query);
			while (rs.next()) {
				System.out.println(rs.getInt("Score") + " " + rs.getString("WorkType"));
			}
			
		}

		catch (Exception ex) {
			System.out.println("GettingGrade failed: An Exception has occurred! " + ex);
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

        return null;
    }

    /**
     * @param studID 
     * @param courseID 
     * @return
     */
    public boolean removeGrade(int studID, int courseID) {
        // TODO implement here
        return false;
    }

}