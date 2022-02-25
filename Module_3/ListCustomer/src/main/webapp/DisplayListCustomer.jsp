<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/15/2022
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CustomerList</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Customer List</h1>
        <tr>
            <th>Name</th>
            <th>Date Of Birth</th>
            <th>Address</th>
            <th>Image</th>
            <p></p>
        </tr>
        <c:forEach items ="${requestScope.customer}" var="customer">
            <td>${customer.name}</td>
            <td>${customer.dateOFBirth}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" width="50px"></td>
            <p></p>
        </c:forEach>
</body>
</html>