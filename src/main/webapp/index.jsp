<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
<div align="center">
 <h1>Employee Registration form</h1>
 <form action = "<%= request.getContextPath() %>/EmployeeServlet" method="post">
   <table style="width: 80%">
    <tr>
       <td>First Name: </td>
       <td><input type="text" name="firstName"></td>
    </tr>
    <tr>
       <td>Last Name: </td>
       <td><input type="text" name="lastName"></td>
    </tr>
    <tr>
       <td>User Name: </td>
       <td><input type="text" name="userName"></td>
    </tr>
    <tr>
       <td>Password: </td>
       <td><input type="password" name="password"></td>
    </tr>
    <tr>
       <td>Address: </td>
       <td><input type="text" name="address"></td>
    </tr>
    <tr>
       <td>Contact: </td>
       <td><input type="text" name="contact"></td>
    </tr>
    <tr>
       <td>Submit: </td>
       <td><input type="submit" name="REGISTER"></td>
    </tr>
   </table>
 </form>
</div>
</body>
</html>