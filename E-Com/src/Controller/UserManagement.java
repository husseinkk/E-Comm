package Controller;

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
		if (u.checkUser(user))
		{
			user = u.signIn(user);
			System.out.print("Welcome, " + user.name);
			return user;
		}
		return null;
	}

	public int addUser(User user) {
		// TODO implement here
		UserDBAccess u = new UserDBAccess();
		if (!u.isUser(user)) {
			return u.addUser(user);
		} else
			return -1;
	}
	
	public boolean addStudent(Student st){
		UserDBAccess u = new UserDBAccess();
		return u.addStudent(st);
	}
	
	public boolean addTeacher(Teacher t){
		UserDBAccess u = new UserDBAccess();
		return u.addTeacher(t);
	}
	
	public boolean isUser(User user) {
		// TODO implement here
		UserDBAccess u = new UserDBAccess();
		if (u.isUser(user)) 
			return true;
		else
			return false;
	}
	public boolean checkUser(User user) {
		// TODO implement here
		UserDBAccess u = new UserDBAccess();
			return u.checkUser(user);
	}

	public boolean removeUser(User user) {
		// TODO implement here
		UserDBAccess u = new UserDBAccess();
		if (u.checkUser(user)) {
			u.removeUser(user.username);
			return true;
		} else
			return false;
	}

	public boolean editUser(User user) {
		// TODO implement here
		UserDBAccess u = new UserDBAccess();
		if (u.checkUser(user)) {
			u.editUser(user);
			return true;
		} else
			return false;
	}

	public boolean rateTeacher(int rate, Teacher teacher) {
		// TODO implement here
		UserDBAccess u = new UserDBAccess();
		if (u.checkUser(teacher)) {
			u.rateTeacher(rate, teacher);
			return true;
		} else
			return false;
	}

}