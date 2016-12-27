package Controller;

import java.util.*;

import DataAccess.CourseDBAccess;

/**
 * 
 */
public class CourseManagement {

    /**
     * Default constructor
     */
    public CourseManagement() {
    }


    /**
     * @param course 
     * @return
     */
    public boolean addCourse(Course course) {
        // TODO implement here
    	CourseDBAccess c = new CourseDBAccess();
		return c.addCourse(course);
    }

    /**
     * @param courseID 
     * @return
     */
    public boolean deleteCourse(String courseName) {
        // TODO implement here
    	CourseDBAccess c = new CourseDBAccess();
		return c.deleteCourse(courseName);
    }

    /**
     * @param courseID 
     * @param teacherID 
     * @param int 
     * @return
     */
    public boolean assignCourse(String courseName, String teacherName) {
        // TODO implement here
    	CourseDBAccess c = new CourseDBAccess();
		return c.assignCourse(courseName, teacherName);
    }

    /**
     * @param courseID 
     * @param studID 
     * @return
     */
    public boolean registerCourse(int courseID, int studID) {
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
     * 
     */
    public void ViewCourse() {
        // TODO implement here
    }

}