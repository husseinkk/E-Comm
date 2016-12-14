package DataAccess;

import java.util.*;

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
    public Connection connect;


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