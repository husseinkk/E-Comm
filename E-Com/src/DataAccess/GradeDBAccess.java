package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Controller.WorkYear;

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
    public boolean addGrade(WorkYear grade, int courseID, int studentID) {
        // TODO implement here
    	Statement stmt = null;
		
		String Query = "select * from Students join Semesters join SemestersCourse on Students.StudentID = Semesters.StudentID "
				+ " && Semesters.SemesterID = SemestersCourses.SemesterID where StudentID = " + grade. + "&& Number = " + semesterNo;
		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int semesterID = rs.getInt("SemesterID");
			Query ="insert into SemestersCourses (SemesterID, CourseID) values (" + semesterID + ", " + courseID + ")"; 
			stmt.executeUpdate(Query);
			}

		catch (Exception ex) {
			System.out.println("RegisterCourse failed: An Exception has occurred! " + ex);
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
     * @param grade 
     * @param studID 
     * @return
     */
    public boolean editGrade(WorkYear grade, int studID) {
        // TODO implement here
        return false;
    }

    /**
     * @param studID 
     * @param courseID 
     * @return
     */
    public static WorkYear[] getGrade(int studID, int courseID) {
        // TODO implement here
    	Statement stmt = null;
    	String Query = "select SCID from  Students join Semesters join SemestersCourses on"
				+ "	Students.StudentID = Semesters.StudentID && Semesters.SemesterID = SemestersCourses.SemesterID"
    			+ " where Students.StudentID = " + studID  + "&& SemestersCourses.CourseID = " + courseID ;
    	WorkYear[] Workyears = null;

		try {
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(Query);
			rs.next();
			int SCID = rs.getInt("SCID");
			Query = "select * from WorkYears join WorkTypes on WorkYears.WorkTypeID = WorkTypes.WorkTypeID "
					+ "where WorkYears.SCID = " + SCID;
			rs = stmt.executeQuery(Query);
			rs.last();
			Workyears = new WorkYear[rs.getRow()];
			rs.beforeFirst();
			int i = 0;
			while (rs.next()) {
				Workyears[i++] = new WorkYear(rs.getDate("DueDate") , rs.getString("Description") 
						, rs.getInt("Score"), rs.getString("WorkType"));
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

        return Workyears;
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