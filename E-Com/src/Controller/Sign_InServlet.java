package Controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.sql.SQLException;
import java.util.concurrent.Executor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.*;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import DataAccess.UserDBAccess;

/**
 * Servlet implementation class Sign_InServlet
 */

public class Sign_InServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	public Sign_InServlet() {
		// TODO Auto-generated constructor stub
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
		String username = request.getParameter("un");
		String password = request.getParameter("pass");
		user.username = username;
		user.password = password;
		user = u.signIn(user);
		if (user != null)	{
			request.setAttribute("user", user);
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}else{
			PrintWriter pw = response.getWriter();
			pw.println("Invalid Username or Password");
		}
	}

}
