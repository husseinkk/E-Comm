package Controller;

import java.util.*;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    public Student(int id) {
		// TODO Auto-generated constructor stub
    	this.studID = id;
	}

	/**
     * 
     */
    private Set<Semester> semesters;

    /**
     * 
     */
    private float GPA;

    /**
     * 
     */
    private Set<Notification> notifications;

    /**
     * 
     */
    public int studID;

    /**
     * 
     */
    public int level;

    /**
     * 
     */
    public String dept;



    /**
     * @param cID 
     * @return
     */
    public int getCourseGrade(int cID) {
        // TODO implement here
        return 0;
    }

    /**
     * @param number 
     * @return
     */
    public int getSemesterGrade(int number) {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    private boolean updateGPA() {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public float getGPA() {
        // TODO implement here
        return 0.0f;
    }

}