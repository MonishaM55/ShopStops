package com.quinnox.basics;
import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionWelcome")
public class SessionWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SessionWelcome() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		 {
		  response.setContentType("text/html");
		  PrintWriter pw=response.getWriter();
		  HttpSession session=request.getSession(false);
		  String myName=(String)session.getAttribute("usname");
		  String myPass=(String)session.getAttribute("uspass");
		  pw.print("Name: "+myName+"Pass: "+myPass);
		  pw.close();
		 }
		 catch(Exception e)
		 {
		  System.out.println(e);
		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
