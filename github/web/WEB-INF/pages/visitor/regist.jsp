<%--
  Created by IntelliJ IDEA.
  User: 张宇恒
  Date: 2018/10/12
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>游客注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/visitor/regist">
    <table border="1">
        <tr>
            <td>游客名</td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr>
            <td>密码</td>
            <td><input type="text" name="password"></td>
        </tr>

        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
