<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="jspproject.Connection"%>  
<jsp:useBean id="objGlavna" class="model.glavna"/>  
  
<jsp:setProperty property="*" name="objGlavna"/>  
  
<%  
boolean status=Connection.addWedding(objGlavna);  
if (status) {
	out.println("Your successfully add a wedding plan");
}
       else { 
    	   out.println("Some error: Try again!");
    %>
       
       <jsp:include page="Korisnik.jsp"></jsp:include> 
    <% } %>
</body>
</html>