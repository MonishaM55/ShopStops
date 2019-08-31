package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Session() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String user=request.getParameter("u");
		String password=request.getParameter("p");
		if(user.equals("nisha") && password.equals("redhat"))
		{
			pw.print("welcome"+user);
			pw.println("<br><br>");
			pw.print("Here is ur password:"+password);
			pw.println("<br><br>");
			HttpSession session=request.getSession();
			session.setAttribute("usname", user);
			session.setAttribute("uspass", password);
			pw.println("session id is:"+session.getId()+"<br/>");
			pw.println("Time is:"+new Date(session.getLastAccessedTime())+"<br/>");
			//pw.println("locale is:"+session.getLastAccessedTime()+"<br/>");
		}
		else{
			pw.println("<html><body text='red'><h3>Login Failed...!</h3></body></html>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request,response);
		    }
	   
	pw.print("<a href='SessionWelcome'>view details</a>");
	pw.close();
	}catch(Exception exp){
		System.out.println(exp);
	}
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request,response);
	}

}
