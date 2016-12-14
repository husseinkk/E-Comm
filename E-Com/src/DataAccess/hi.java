package DataAccess;

import Controller.User;

public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User() ;
		user.username= "1";
		user.password = "1";
		UserDBAccess u = new UserDBAccess();
		u.signIn(user);
	}

}
