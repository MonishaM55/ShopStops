package com.quinnox.basics;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestMethodDemo")
public class RequestMethodDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RequestMethodDemo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Servlet HelloWorld</title>");
	      out.println("</head>");
	      out.println("<body bgcolor=\"#ffffff\">");
	      out.println("<h1>Request methods of ServletRequest Interface</h1>");
	      out.println("<h1>Servlet ServletServlet at :" +request.getContextPath()+ "</h1>"); 
	      out.println("<h1>Servlet ServletServlet Requested URI :" +request.getRequestURI() + "</h1>"); 
	      out.println("<h1>Servlet ServletServlet Protocol :" +request.getProtocol()+ "</h1>"); 
	      out.println("<b>Server Name: </b>"+request.getServerName()+"<br/>");
	      out.println("<b>Server Port Number: </b>"+request.getServerPort()+"<br/>");
	      out.println("<h3>Random Value for each Request: " +Math.random()+ "</h3>"); 
	      out.println("</body>");
	      out.println("</html>");
	      out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
