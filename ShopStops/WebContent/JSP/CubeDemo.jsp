<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="cube" scope="session" class="com.quinnox.basics.model.CubeBean"/>
<jsp:setProperty  name="cube" property="num" value="2"/>
<body bgcolor="lightblue">
<h1>cube of a number</h1>
<b>Cube of a number:</b>
<jsp:getProperty name="cube" property="num"/>
</body>
</html>