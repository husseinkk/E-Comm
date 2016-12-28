package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class editUserServlet extends javax.servlet.http.HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	UserManagement u = new UserManagement();
		User user = new User();
		String name = (String) request.getParameter("name");
		String username = (String) request.getParameter("un");
		String password = (String) request.getParameter("pass");
		System.out.println("name: " + name + " un: " + username + " pass: "+ password);
		user.name = name;
		user.username = username;
		user.password = password;
		u.editUser(user);
		request.setAttribute("user", request.getSession().getAttribute("user"));
		request.getRequestDispatcher("Home.jsp").forward(request, response);
    	
    }
}
