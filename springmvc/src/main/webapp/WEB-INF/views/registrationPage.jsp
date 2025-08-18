<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
<form action="/registerUser" method="post">
  <h3>Register User</h3>
  <pre>
    ID: <input type="number" />
    Name: <input type="text" />
    Email: <input type="text" />
    <input type="submit" value="Register">
  </pre>
</form>
</body>
</html>