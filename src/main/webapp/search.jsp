<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %>

<html>
<head>
    <title>Products</title>
</head>
<body>
<sql:setDataSource var = "product" driver = "com.mysql.jdbc.Driver"
                   url = "jdbc:mysql://localhost:3306/sucette"
                   user = "root"  password = "toor"/>

<%--@elvariable id="SearchController" type="java"--%>
<sql:query dataSource = "${SearchController}" var = "products">
    SELECT * from products;
</sql:query>
<table border = "1" width = "100%">
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Product Price</th>
        <th>Description</th>
    </tr>

    <c:forEach var = "product" items = "${products.products}">
        <tr>
            <td><c:out value = "${product.productNo}"/></td>
            <td><c:out value = "${product.productName}"/></td>
            <td><c:out value = "${product.productPrice}"/></td>
            <td><c:out value = "${product.productDescription}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
