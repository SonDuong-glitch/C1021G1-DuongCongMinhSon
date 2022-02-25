<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/17/2022
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name Product </td>
        <td>${product.getNameProduct()}</td>
    </tr>
    <tr>
        <td>Product Description </td>
        <td>${product.getProductDescription()}</td>
    </tr>
    <tr>
        <td>Producer: </td>
        <td>${product.getProducer()}</td>
    </tr>
</table>
</body>
</html>
