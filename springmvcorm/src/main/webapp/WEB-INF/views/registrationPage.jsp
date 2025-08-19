<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register User</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
          $("#id").change(function() {
            $.ajax({
              url: 'verifyExist',
              data: {
                id: $("#id").val()
              },
              success: function(responseText) {
                $("#errMsg").text(responseText);

                if(responseText !== "") {
                  $("#id").focus();
                }
              }
            })
          })
        });
    </script>
</head>
<body>
<form action="registerUser" method="post">
    <pre>
        Id: <input type="number" name="id" id="id" /><span id="errMsg"></span>
        Name: <input type="text" name="name" />
        Email: <input type="text" name="email" />
        <input type="submit" value="register" />
    </pre>
</form>
</body>
</html>