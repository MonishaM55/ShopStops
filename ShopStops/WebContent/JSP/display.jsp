<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello this is a display.jsp page</h2>
my name is:<%=request.getParameter("name")%><br>
web site:<%=request.getParameter("company")%><br>
Topic:<%=request.getParameter("technology")%><br>
Forward request came from the page:<%=request.getParameter("reqfrom")%>
</body>
</html>