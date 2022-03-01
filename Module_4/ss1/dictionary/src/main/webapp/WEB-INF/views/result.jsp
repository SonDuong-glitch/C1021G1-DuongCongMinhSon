<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 3/1/2022
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="check" method="post">
    <label for="english">Tiếng Việt</label>
    <input type="text" name="english" id="english">
    <button type="submit">Submit</button>
    <c:choose>
        <c:when test="${eng!=null}">
            <h3>${eng}</h3>
        </c:when>
        <c:otherwise>
            <h3>không có kết quả</h3>
        </c:otherwise>
    </c:choose>
</form>



</body>
</html>
