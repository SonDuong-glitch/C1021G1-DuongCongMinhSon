<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 3/2/2022
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>
<form action="save" >
    <h1>
        Sandwich Condiments
    </h1>
    <input type="checkbox" id="lettuce" value="lettuce" name="condiments">
    <label for="lettuce">lettuce</label>
    <input type="checkbox"id="tomato"  value="tomato" name="condiments">
    <label for="tomato">tomato</label>
    <input type="checkbox" id="mustard" value="mustard" name="condiments">
    <label for="mustard">mustard</label>
    <input type="checkbox" id="sprouts" value="sprouts" name="condiments">
    <label for="sprouts">sprouts</label>
    <button type="submit">Save</button>
</form>
</body>
</html>
