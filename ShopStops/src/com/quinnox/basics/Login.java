package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("http://www.quinnox.com");
	//response.getWriter().append("served at:").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String user=request.getParameter("u");
		String pass=request.getParameter("p");
		if(user.equals("nisha") && pass.equals("redhat"))
		{
			//pw.println("Welcome" +user+ "<br><br>");
			//pw.println("Login Success...!");}
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");
			rd.forward(request,response);}
		else{
			//pw.println("Login failed.....!");
		    //pw.close();
			pw.println("<html><body text='red'><h3>Login Failed...!</h3></body></html>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request,response);
		}
	}
}
	
