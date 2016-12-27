package Controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class assignCourseServlet extends javax.servlet.http.HttpServlet  {
	
private static final long serialVersionUID = 4L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* doGet(request, response); */
		CourseManagement course = new CourseManagement();
		Course c = new Course();
		String Cname = (String) request.getParameter("Cname");
		String Tname = (String) request.getParameter("Tname");		
		System.out.println("Coursename" +Cname + "Teachername " + Tname + " " );
		if(course.assignCourse(Cname, Tname)){
			request.setAttribute("user", request.getSession().getAttribute("user"));
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
	}


    /**
     * 
     */
    public void Service() {
        // TODO implement here
    }

}