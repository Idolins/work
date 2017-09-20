<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/7
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<form action="register">
    用户名
    <input type="text" name="username"> <br>
    密码
    <input type="text" name="password"> <br>
    <input type="submit" value="注册">
</form>


${requestScope.text}
</body>
</html>
