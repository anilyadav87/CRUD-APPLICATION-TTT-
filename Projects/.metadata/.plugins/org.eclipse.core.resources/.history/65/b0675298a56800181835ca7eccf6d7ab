<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
		<th>Employee Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Address</th>
		<th>Contact No</th>
		</tr>
		<c:forEach items="${data}" var="r">
		<tr>
			<td>${r.eId}</td>
			<td>${r.firstName}</td>
			<td>${r.lastName}</td>
			<td>${r.address}</td>
			<td>${r.contactNo}</td>
		</tr>
		
		</c:forEach>
	</table>
</body>
</html>