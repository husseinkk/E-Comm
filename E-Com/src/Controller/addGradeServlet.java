package Controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DataAccess.GradeDBAccess;

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
		String cname = request.getParameter("cname");
		String desc = request.getParameter("desc");
		String studId = request.getParameter("studId");
		String value = request.getParameter("val");
		String type = request.getParameter("type");
		float score = Float.parseFloat(value);
		WorkYear wk = new WorkYear();
		wk.type = type;
		wk.score = score;
		wk.description = desc;
		GradeDBAccess gd = new GradeDBAccess();
		gd.addGrade(wk, cname, Integer.parseInt(studId));
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