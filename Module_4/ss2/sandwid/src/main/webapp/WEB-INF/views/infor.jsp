<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 3/2/2022
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
SandWid has
<c:forEach var="condiment" items="${condiments}">
<h1>${condiment}</h1>
</c:forEach>
</body>
</html>
