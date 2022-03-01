<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 3/1/2022
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form action="/calculator" method="get">
    <label for="value">Tỉ giá</label><br>
    <input type="text" name="value" id="value" placeholder="nhập tỉ giá">
    <br><r></r>
    <label for="price"></label>số tiền<br>
    <input type="text" name="price" id="price" placeholder="nhập số tiền"><br><br>
    <input class="btn bg-primary" type="submit" value="Submit">
    <c:if test="${result!=null}">
        <h3>Tổng tiền thu được: ${result}</h3>
    </c:if>
</form>
</body>
</html>
