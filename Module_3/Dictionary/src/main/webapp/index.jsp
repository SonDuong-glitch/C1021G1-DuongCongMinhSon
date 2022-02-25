<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/15/2022
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
  <form action="/ServletDictionary" method="post">
    Dictionary
    <input type="text" name="txtSearch" placeholder="input sth">
    <input type="submit" id="submit" value="search">
  </form>
  </body>
</html>
