package com.quinnox.basics.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quinnox.basics.dao.CustomerDAO;
import com.quinnox.basics.model.Customer;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SaveServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("psw");
		String email=request.getParameter("Email");
		String country=request.getParameter("country");
		Customer c=new Customer();
		c.setName(name);
		c.setPassword(password);
		c.setEmail(email);
		c.setCountry(country);
		
		int status=CustomerDAO.insertCustomer(c);
		if(status>0)
		{
			pw.print("<p> Record saved Successfully</p>");
			request.getRequestDispatcher("ViewCustomer.html").include(request, response);
		}
		else
		{
			pw.print("<p>Sorry!!!Unable to save Record</p>");
		}
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
