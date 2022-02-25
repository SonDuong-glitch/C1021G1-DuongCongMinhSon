<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/16/2022
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Manager</title>
</head>
<body>

    <h1>Product</h1>
    <p>
        <a href="/product?action=create">Create new Product</a>
    </p>
    <table style="border: 10px">
        <tr>
            <th>ID</th>
            <th>Name Of Product</th>
            <th>Product Description</th>
            <th>Producer</th>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getNameProduct()}</td>
                <td>${product.getProductDescription()}</td>
                <td>${product.getProducer()}</td>
                <td><a href="/product?action=edit&id=${product.getId()}">Edit</a></td>
                <td><a href="/product?action=delete&id=${product.getId()}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
