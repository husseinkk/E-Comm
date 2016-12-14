package DataAccess;

import java.util.*;

/**
 * 
 */
public class UserDBAccess {

    /**
     * Default constructor
     */
    public UserDBAccess() {
    }

    /**
     * 
     */
    public Connection connect;


    /**
     * @param user 
     * @return
     */
    public User signIn(User user) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @return
     */
    public boolean addUser(User user) {
        // TODO implement here
        return false;
    }

    /**
     * @param username 
     * @return
     */
    public boolean removeUser(string username) {
        // TODO implement here
        return false;
    }

    /**
     * @param user 
     * @return
     */
    public boolean editUser(User user) {
        // TODO implement here
        return false;
    }

    /**
     * @param level 
     * @return
     */
    public Set<User> selectUser(int level) {
        // TODO implement here
        return null;
    }

    /**
     * @param userID 
     * @return
     */
    public User selectUser(int userID) {
        // TODO implement here
        return null;
    }

    /**
     * @param gpa 
     * @param department 
     * @return
     */
    public Set<User> selectUser(float gpa, string department) {
        // TODO implement here
        return null;
    }

    /**
     * @param course 
     * @param type 
     * @return
     */
    public Set<User> selectUser(Course course, UserType type) {
        // TODO implement here
        return null;
    }

    /**
     * @param user 
     * @return
     */
    public boolean checkUser(User user) {
        // TODO implement here
        return false;
    }

    /**
     * @param rate 
     * @param teacher 
     * @return
     */
    public boolean rateTeacher(int rate, Teacher teacher) {
        // TODO implement here
        return false;
    }

}