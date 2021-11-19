<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register Form</title>
</head>
<body>
<div align="center">
    <h1>Register</h1>
    <form action="userregister" method="post">
        <table style="with: 80%">
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>Surname</td>
                <td><input type="text" name="surname" /></td>
            </tr>
            <tr>
                <td>Login</td>
                <td><input type="text" name="login" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
            <tr>
                <td>E-mail</td>
                <td><input type="text" name="email" /></td>
            </tr>
            <tr>
                <td>Masz subscrypcj??</td>
                <td><input type="text" name="subscription" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>