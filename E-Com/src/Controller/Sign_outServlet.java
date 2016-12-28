package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 */
public class Sign_outServlet {

    /**
     * Default constructor
     */
    public Sign_outServlet() {
    }

    /**
     * 
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* doGet(request, response); */
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("signin.jsp").forward(request, response);
		HttpSession session=request.getSession();  
        session.invalidate();  
        out.print("You are successfully logged out!");  
        out.close(); 
		
	}


}