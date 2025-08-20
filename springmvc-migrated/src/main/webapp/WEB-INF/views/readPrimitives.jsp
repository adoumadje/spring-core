<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
	<title>Read Primitives</title>
</head>
<body>
	<h1>From request object</h1>
	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");
		out.println("id: " + id);
		out.println("name: " + name);
		out.println("salary: " + salary);
	%>
	<h1>Using JSP expressions</h1>
	<p>id: <strong>${id}</strong></p>
	<p>name: <strong>${name}</strong></p>
	<p>salary: <strong>${salary}</strong></p>
</body>
</html>