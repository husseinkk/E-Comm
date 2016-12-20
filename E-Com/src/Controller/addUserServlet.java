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
		
		int userID = u.addUser(user);
		if(usertype.equals("student")){
			Student st = new Student();
			st.dept = request.getParameter("typeDept");
			st.studID = request.getParameter("studID");
			st.userID = userID;
			u.addStudent(st);
		}
		if(usertype.equals("teacher")){
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