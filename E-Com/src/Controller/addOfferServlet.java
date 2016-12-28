package Controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class addOfferServlet extends javax.servlet.http.HttpServlet{
	private static final long serialVersionUID = 4L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* doGet(request, response); */
		OfferManagemet f = new OfferManagemet();
		Offer offer = new Offer();
		String oname = (String) request.getParameter("name");
		String odesc = (String) request.getParameter("desc");
		String oGPA = (String)request.getParameter("gpa");
		String oDept = (String) request.getParameter("type");
		float GPA = Float.parseFloat(oGPA);
		offer.GPA = GPA;
		offer.description = odesc;
		offer.department = oDept;
		offer.offerName = oname;
		System.out.println(oname + " " + odesc);
		if(f.addOffer(offer)){
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