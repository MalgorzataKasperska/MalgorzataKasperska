<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="pl" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search</title>
</head>
<body>
    <p>Search</p>
    <jsp:useBean id="SearchController" scope="request" type="com.sun.media.sound.SF2Soundbank"/>
    <c:forEach items="${SearchController.product}" var="product">
        <ul>
                ${product.productNo} - ${product.productName} ${product.productPrice}
        </ul>
    </c:forEach>
</body>
</html>