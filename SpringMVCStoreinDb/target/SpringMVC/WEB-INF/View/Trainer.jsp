<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@  page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>
		<h1>${Trainer}</h1>
		</p>
	</div>
	<div>
		<form:form method="POST" action="/SpringMVCStoreinDb/Trainer"
			modelAttribute="trainer" enctype="multipart/form-data">
			<table>
				<tr>
					<td>Name</td>
					<td><form:input type="text" path="name"></form:input></td>
				</tr>
				<tr>
					<td>Subject</td>
					<td><form:input type="text" path="subject"></form:input></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><form:input type="text" path="salary"></form:input></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>