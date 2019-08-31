package com.quinnox.basics;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Add")
public class Add extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public Add() {
        super();
        
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int k=i+j;
		PrintWriter out=response.getWriter();
		out.println("Result is"+k);
	}

}
