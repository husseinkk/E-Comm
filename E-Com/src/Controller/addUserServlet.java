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
		String name = request.getParameter("name");
		String username = request.getParameter("un");
		String usertype = request.getParameter("type");
		String password = request.getParameter("pass");
		user.name = name;
		user.username = username;
		user.usertype = usertype;
		user.password = password;
		System.out.println("User" + ((User)request.getAttribute("user")).name);
		u.addUser(user);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

    /**
     * 
     */
    public void Service() {
        // TODO implement here
    }

}