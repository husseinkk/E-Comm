package DataAccess;

import Controller.User;
import DataAccess.UserDBAccess;

public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User() ;
		user.username= "1";
		user.password = "1";
		UserDBAccess u = new UserDBAccess();
		u.signIn(user);
		System.out.println(user.username + " " + user.password + " " + user.name + " " +user.usertype);
	}

}
