package Controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class addGradeServlet extends javax.servlet.http.HttpServlet{
	private static final long serialVersionUID = 4L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* doGet(request, response); */
		GradeManagement grade = new GradeManagement();
		Grade grade = new Grade();
		String cname = (String) request.getParameter("Cname");
		String cdesc = (String) request.getParameter("Cdesc");
		String chours = (String) request.getParameter("Chours");
		String cdept = (String) request.getParameter("Cdept");
		c.courseName = cname;
		c.courseDescription = cdesc;
		c.Hour = Integer.parseInt(chours);
		c.dept = cdept;
		System.out.println(cdesc + " " + cname);
		if(course.addCourse(c)){
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