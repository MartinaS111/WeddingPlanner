<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor=#ffc04d>
<div align="center">
<%@page import="jspproject.Connection"%>  
<jsp:useBean id="obj" class="model.login" scope="page" type="model.login"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
boolean status=Connection.validate(obj);  
if (status) { %>
	<a href='http://localhost:8080/Wedding/Korisnik.jsp'>Continue</a>
    <% } 
       else { 
    %>
       
       <jsp:include page="Login.jsp"></jsp:include> 
       <p>Sorry, email or password error</p> 
    <% } %>
</div>
</body>
</html>