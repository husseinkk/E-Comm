package Controller;

import java.util.*;
import DataAccess.UserDBAccess;

/**
 * 
 */
public class UserManagement {

    /**
     * Default constructor
     */
    public UserManagement() {
    }


    /**
     * @return
     */
    public boolean signOut() {
        // TODO implement here
        return false;
    }

    /**
     * @param user 
     * @return
     */
    public User signIn(User user) {
        // TODO implement here
    	UserDBAccess u = new UserDBAccess();
    	if(u.checkUser(user));{
    		u.signIn(user);
    		System.out.print("Welcome, " + user.name);
    		//Home.jsp
    	}
    	//InvalidLogin.jsp
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
     * @param user 
     * @return
     */
    public boolean removeUser(User user) {
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
     * @param rate 
     * @param teacher 
     * @return
     */
    public boolean rateTeacher(int rate, Teacher teacher) {
        // TODO implement here
        return false;
    }

}