<%--
  Created by IntelliJ IDEA.
  User: 张宇恒
  Date: 2018/10/12
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简历填写</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/resume/add">
    <table border="1" cellspacing="0">
        <tr>
            <td colspan="2">简历</td>
        </tr>

        <tr>
            <td>姓名：<input type="text" name="name" value="请输入真实姓名"></td>
            <td>性别：<input type="text" name="sex"></td>
        </tr>

        <tr>
            <td>年龄：<input type="text" name="age" value="请输入"></td>
            <td>学历：<input type="text" name="education"></td>
        </tr>

        <tr>
            <td>联系：<input type="text" name="contact" value="请输入联系方式"></td>
            <td>邮箱：<input type="email" name="email" value="请输入邮箱"></td>
        </tr>

        <tr>
            <td>职位：<input type="text" name="job"></td>
            <td>面貌：<input type="text" name="face"></td>
        </tr>

        <tr>
            <td>工作：<input type="text" name="work" value="请输入工作名称"></td>
            <td>经验：<input type="text" name="experience" value="请输入几年工作经验"></td>
        </tr>

        <tr>
            <td>薪资：<input type="text" name="salary" value="请输入最低最高薪资"></td>
            <td>爱好：<input type="text" name="hobby" value="请输入兴趣爱好"></td>
        </tr>

        <tr>
            <td><input type="submit" name="save" value="保存"></td>
            <td><input type="submit" name="return" value="返回"></td>
        </tr>
    </table>
</form>
</body>
</html>
