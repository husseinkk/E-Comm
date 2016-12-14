package DataAccess;

import java.util.*;

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
    public Connection connect;


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
    public Set<Course> selectCourses(int studentID) {
        // TODO implement here
        return null;
    }

}