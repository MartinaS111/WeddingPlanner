<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registracija</title>
</head>
<body bgcolor=#ffc04d>
<div class="page-header" align="center">
  <h1>Wedding Day <br> <small>Registriraj se!</small></h1>
</div>
<form action="Register" method="post">
<div align="center">
Ime: <input type="text" name="ime"><br><br>
Prezime: <input type="text" name="prezime"><br><br>
Telefon: <input type="text" name="telefon"><br><br>
E-mail: <input type="text" name="email"><br><br>
Password: <input type="password" name="password"><br><br>
</div><br>
<div class="panel-body" align="center">
<button type="submit" class="btn btn-warning" onclick="location.href='/Wedding/Korisnik.jsp';">Registracija</button>
</div>
</form>
</body>
</html>