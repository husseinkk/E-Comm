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
public class deleteCourseServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 3L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CourseManagement u = new CourseManagement();
		Course course = new Course();
		String un = request.getParameter("course");
		course.courseName = un;
		request.setAttribute("user", request.getSession().getAttribute("user"));
		u.deleteCourse(course.courseName);
		request.setAttribute("user", request.getSession().getAttribute("user"));
		request.getRequestDispatcher("Home.jsp").forward(request, response);
	}
}
