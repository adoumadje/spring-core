<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
<form action="registerUser" method="post">
  <h3>Register User</h3>
  <pre>
    ID: <input type="number" name="id" />
    Name: <input type="text" name="name" />
    Email: <input type="text" name="email" />
    <input type="submit" value="Register">
  </pre>
</form>
</body>
</html>