<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/17/2022
  Time: 9:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
    <a href="/product">Back to customer list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td>${requestScope["product"].getProductName()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${requestScope["product"].getProductDescription()}</td>
            </tr>
            <tr>
                <td>Address: </td>
                <td>${requestScope["product"].getProducer()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
