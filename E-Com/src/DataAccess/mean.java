package DataAccess;

import java.sql.SQLException;

import Controller.User;

public class mean {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		User user = new User() ;
		user.username= "1";
		user.password = "1";
		UserDBAccess u = new UserDBAccess();
		u.signIn(user);
	}

}
