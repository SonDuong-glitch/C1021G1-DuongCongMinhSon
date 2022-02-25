<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/17/2022
  Time: 8:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h1>Edit Product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td><input type="hidden" name="id" id="id" value="${product.getId()}"></td>
            </tr>
            <tr>
                <td>Name Product: </td>
                <td><input type="text" name="nameProduct" id="nameProduct" value="${product.getNameProduct()}"></td>
            </tr>
            <tr>
                <td>Product Description: </td>
                <td><input type="text" name="productDescription" id="ProductDescription" value="${product.getProductDescription()}"></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text" name="producer" id="producer" value="${product.getProducer()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
