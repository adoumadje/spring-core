<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register User</title>
</head>
<body>
<form action="registerUser" method="post">
    <pre>
        Id: <input type="number" name="id" />
        Name: <input type="text" name="name" />
        Email: <input type="text" name="email" />
        <input type="submit" value="register" />
    </pre>
</form>
</body>
</html>