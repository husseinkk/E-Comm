package Controller;

import java.util.*;

/**
 * 
 */
public class WorkYear {

    /**
     * Default constructor
     */
    public WorkYear() {
    }

    /**
     * 
     */
    public Date dueDate;

    /**
     * 
     */
    public float score;

    /**
     * 
     */
    public String description;

    /**
     * 
     */
    public String type;


    /**
     * @param score 
     * @param dueDate 
     * @param description 
     * @param string 
     * @return
     */
    public WorkYear(Date dueDate, String description, int score, String string) {
        // TODO implement here
    	this.dueDate = dueDate;
    	this.description = description;
    	this.score = score;
    	this.type = string;
    }

    /**
     * @param student 
     * @param course 
     * @return
     */
    public boolean addWorkYear(Student student, Course course) {
        // TODO implement here
        return false;
    }

    /**
     * @param student 
     * @param course 
     * @param semester 
     * @return
     */
    public WorkYear getWorkYear(Student student, Course course, Semester semester) {
        // TODO implement here
        return null;
    }

}