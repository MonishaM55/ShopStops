package com.quinnox.basics.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.quinnox.basics.dao.LoginDAO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("u");
		String password=request.getParameter("p");
		Base64.Encoder encoder=Base64.getEncoder();
		String normalString=password;
		String encodedString=encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
	
		if(LoginDAO.validate(email,encodedString)) {
			HttpSession session=request.getSession(true);
			session.setAttribute("user",email);
			RequestDispatcher rd=request.getRequestDispatcher("ViewCustomer.jsp");
			rd.forward(request,response);
			pw.print("Login successfull");
		}
		else {
			pw.print("Sorry username or password does not exists");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request,response);

		}
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
