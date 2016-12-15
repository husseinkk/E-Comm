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
			u.signIn(user);
			System.out.print("Welcome, " + user.name);
			// Home.jsp
		}
		// InvalidLogin.jsp
		return null;
	}

	public boolean addUser(User user) {
		// TODO implement here
		UserDBAccess u = new UserDBAccess();
		if (!u.checkUser(user)) {
			u.addUser(user);
			return true;
		} else
			return false;
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