<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/updateProduct">
  Product Id <input type="text" name="pid" value="${prod.pid}" readonly>
Product Name <input type="text" name="pname" value="${prod.pname}">
Product Price <input type="text" name="price"  value="${prod.price}">
<button type="submit" name="btn">update Product</button>
</form>
</body>
</html>