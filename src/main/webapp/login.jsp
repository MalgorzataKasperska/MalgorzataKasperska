<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2021-11-05
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %>
<html>
<head>
    <title>Login JSP Page</title>
</head>

<body>
<h1>Login Form</h1>
<form method="post" action="LoginCheck">
    <table>
        <tr>
            <td>Username</td><td>
            <input type="text" name="uname"></td>
        </tr>
        <tr>
            <td>Password</td><td>
            <input type="password" name="password"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Login"><a href="http://localhost:8080/Login_war_exploded/UserRegister.jsp">Register</a></td>

        </tr>
    </table>
</form>
</body>
</html>