package com.quinnox.basics;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ServletInterfaceDemo")
public class ServletInterfaceDemo implements Servlet {
          ServletConfig config=null;
    public ServletInterfaceDemo() {
    }
	public void init(ServletConfig config) throws ServletException {
	      this.config=config;
	      System.out.println("Servlet is initialized");
	}

	public void service(ServletRequest request, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");
	}
	public void destroy() {
	    System.out.println("servlet is destroyed");
	}

	public ServletConfig getServletConfig() {
		
		return config;
	}

	public String getServletInfo() {
		
		return "copyright 2010-2019"; 
	}

}
