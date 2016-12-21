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
		String name = (String) request.getParameter("name");
		String username = (String) request.getParameter("username");
		String usertype = (String) request.getParameter("usertype");
		String password = (String) request.getParameter("password");
		user.name = name;
		user.username = username;
		user.usertype = usertype;
		user.password = password;
		System.out.println(user.name + " " +user.username + " " + user.usertype);
		int userID = u.addUser(user);
		System.out.println(userID);
		if(usertype.equals("Student")){
			Student st = new Student();
			st.dept = request.getParameter("typeDept");
			st.studID = request.getParameter("studID");
			st.userID = userID;
			u.addStudent(st);
		}
		if(usertype.equals("Teacher")){
			Teacher t = new Teacher();
			t.dept = request.getParameter("typeDept");
			t.userID = userID;
			u.addTeacher(t);
		}
		request.setAttribute("user", request.getSession().getAttribute("user"));
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}

    /**
     * 
     */
    public void Service() {
        // TODO implement here
    }

}