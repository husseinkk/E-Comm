package Controller;

import java.util.*;

import DataAccess.GradeDBAccess;

/**
 * 
 */
public class GradeManagement {

    /**
     * Default constructor
     */
    public GradeManagement() {
    }



    /**
     * @param studID 
     * @param courseID 
     * @return
     */
    public Grade viewGrade(int studID, void courseID) {
        // TODO implement here
        return null;
    }

    /**
     * @param grade 
     * @param studID 
     * @return
     */
    public boolean editGrade(WorkYear work, int studID, String Cname) {
        // TODO implement here
    	
        return false;
    }

    /**
     * @param grade 
     * @param studID 
     * @return
     */
    public boolean addGrade(WorkYear work, String Cname, int studID) {
        // TODO implement here
    	GradeDBAccess grade = new GradeDBAccess();
    	return grade.addGrade(work,Cname , studID);
    }

}