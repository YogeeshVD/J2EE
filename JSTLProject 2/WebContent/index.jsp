<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h3>Employee Details</h3>
	<table>
		<tr>
			<td>Id :</td>
			<td>${employee.id}</td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><input type="text" name="txtName" value="${employee.name}"></td>
		</tr>
		<tr>
			<td><label><input type="radio" value="${employee.gender}" name="Male" id="gender" <c:if test = "${employee.gender eq 'Male'}"></c:if>checked/>Male</label></td>

			<td><label><input type="radio" value="${employee.gender}" name="Female" id="gender" <c:if test = "${employee.gender eq 'Female'}"></c:if>/>Female</label></td>
		
		</tr>
	</table>
</body>
</html>
