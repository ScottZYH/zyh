<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 张宇恒
  Date: 2018/10/17
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>职位页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <script type="text/javascript"></script>
</head>
<body>
<table border="2px" cellspacing="0">
    <tr>
        <td>ID</td>
        <td>NAME</td>
    </tr>
    <c:forEach items="${requestScope.depts}" var="dept">
        <tr>
            <td>${dept.id}</td>
            <td>${dept.name}</td>
            <td><a class="delete" href="#">DELETE</a></td>
            <td><a href="${pageContext.request.contextPath}/dept/input?id=${dept.id}">EDIT</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
