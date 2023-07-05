<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div align="center">
      <h1>Login Page</h1>
      <hr>
      <form action="logedIn" method="post">
          login: <input type="text" name="username" placeholder="Enter Username">
          <br><br>
          Password: <input type="password" name="password" placeholder="">
          <br><br>
          
          <input type=submit value=submit>
           <input type=reset value=reset>
      </form>
      
   </div>

</body>
</html>