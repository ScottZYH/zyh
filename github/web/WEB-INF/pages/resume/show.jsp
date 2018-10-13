<%--
  Created by IntelliJ IDEA.
  User: 张宇恒
  Date: 2018/10/13
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看简历</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <script type="text/javascript"></script>
</head>
<body>
<table border="2px" cellspacing="0">
    <tr>
        <td>NAME</td>
        <td>SEX</td>
        <td>AGE</td>
        <td>EDUCATION</td>
        <td>CONTACT</td>
        <td>EMAIL</td>
        <td>JOB</td>
        <td>FACE</td>
        <td>WORK</td>
        <td>EXPERIENCE</td>
        <td>SALARY</td>
        <td>HOBBY</td>
    </tr>

    <c:forEach items="${requestScope.res}" var="res">
        <tr>
            <td>${res.name}</td>
            <td>${res.sex}</td>
            <td>${res.age}</td>
            <td>${res.education}</td>
            <td>${res.contact}</td>
            <td>${res.email}</td>
            <td>${res.job}</td>
            <td>${res.face}</td>
            <td>${res.work}</td>
            <td>${res.experience}</td>
            <td>${res.salary}</td>
            <td>${res.hobby}</td>
            <td><input type="submit" value="发送面试邀请" src="admin/invite.jsp"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
