package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CookieServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String name=request.getParameter("u");
			String password=request.getParameter("p");
			pw.print("Hello Here:"+name);
			pw.print("Your Password is:"+password);
			
			Cookie c1=new Cookie("userName",name);
			Cookie c2=new Cookie("userPassword",password);
			
			response.addCookie(c1);
			response.addCookie(c2);
			
			pw.print("<a href='WelcomeCookie'>view details</a>");
			pw.close();
			}catch(Exception exp){
				System.out.println(exp);
			}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
