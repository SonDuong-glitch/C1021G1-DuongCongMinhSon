<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/17/2022
  Time: 8:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>Create Product</legend>
        <table>
            <tr>
                <td>Name Product: </td>
                <td><input type="text" name="nameProduct" id="nameProduct"></td>
            </tr>
            <tr>
                <td>Product Description </td>
                <td><input type="text" name="productDescription" id="productDescription"></td>
            </tr>
            <tr>
                <td>Producer: </td>
                <td><input type="text" name="producer" id="producer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create Product"></td>
                <td><a href="/product">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
