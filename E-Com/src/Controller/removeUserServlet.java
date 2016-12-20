package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class removeUserServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 3L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserManagement u = new UserManagement();
		User user = new User();
		String un = request.getParameter("name");
		user.username = un;
		request.setAttribute("user", request.getSession().getAttribute("user"));
		u.removeUser(user);
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}
}
