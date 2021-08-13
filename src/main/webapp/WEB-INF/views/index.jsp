<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    buffer="10kb" pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<head>
<body>
<a href="hello">Click me to go to controller</a>
<form action="validateUser" method="post">
  User name <input type="text" name="uname">
  Password <input type="password" name="pass">
  <button type="submit" name="btn">Login</button>
</form>


</body>
</html>