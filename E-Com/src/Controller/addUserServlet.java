package Controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class addUserServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 2L;
    /**
     * Default constructor
     */
    public addUserServlet() {
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* doGet(request, response); */
		UserManagement u = new UserManagement();
		User user = new User();
		String username = request.getParameter("un");
		String ID = request.getParameter("ID");
		int id = Integer.parseInt(ID);
		user.username = username;
		user.userID = id;
		if(!u.checkUser(user)){
			String usertype = request.getParameter("type");
		}
	}

    /**
     * 
     */
    public void Service() {
        // TODO implement here
    }

}