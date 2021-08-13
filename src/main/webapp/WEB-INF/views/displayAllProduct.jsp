<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr><th>Product Id</th><th>Name</th><th>Price</th><th>action</th></tr>
<c:forEach var="p" items="${plist}">
<tr>
<td>${p.pid}</td>
<td>${p.pname}</td>
<td>${p.price}</td>
<td>
<a href="deleteProduct/${p.pid}">delete</a>/
<a href="editProduct/${p.pid}">edit</a>

</td>
</tr>
</c:forEach>
</table>
<a href="addProduct">Add new Product</a>
</body>
</html>