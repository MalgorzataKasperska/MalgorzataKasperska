<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.sucette.Search" %>

<html>
<head>
    <title>Products</title>
</head>
<body>
<p>Products</p>
<%
    List<Search> products = (List<Search>) request.getAttribute("products");
%>
<form action="${pageContext.request.contextPath}/search" method="POST">
    Search:
    <input type="text" id="fname" name="fname" placeholder="Type what are you looking for" />
    <input type="submit" value="search" />
</form>

<table border = "1" width = "100%">
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Product Price</th>
        <th>Description</th>
    </tr>

       <c:forEach items="${products}" var="product">
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
