package Controller;

import java.util.*;
import DataAccess.UserDBAccess;

public class UserManagement {

    public UserManagement() {
    }

    public boolean signOut() {
        // TODO implement here
        return false;
    }

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

    public boolean addUser(User user) {
        // TODO implement here 
    	UserDBAccess u = new UserDBAccess();
    	if(!u.isUserFound(user)){
    		u.addUser(user);
    		return true;
    }
    	else
    		return false;
    }

    public boolean removeUser(User user) {
        // TODO implement here
    	UserDBAccess u = new UserDBAccess();
    	if(u.isUserFound(user))
    		u.removeUser(user.username);
    	else
    		return false;
    }

    public boolean editUser(User user) {
        // TODO implement here
    	UserDBAccess u = new UserDBAccess();
    	if(u.isUserFound(user))
    		u.editUser(user);
    	else
    		return false;
    }

    public boolean rateTeacher(int rate, Teacher teacher) {
        // TODO implement here
    	UserDBAccess u = new UserDBAccess();
    	if(u.isUserFound(teacher))
    		u.rateTeacher(rate, teacher);
    	else
    		return false;
    }

}