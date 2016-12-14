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
    private Date dueDate;

    /**
     * 
     */
    private int score;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    public WorkType type;


    /**
     * @param score 
     * @param dueDate 
     * @param description 
     * @param type 
     * @return
     */
    public void WorkYear(int score, Date dueDate, String description, WorkType type) {
        // TODO implement here
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