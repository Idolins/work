<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/4
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login">
    用户名 <label>
    <input type="text" name="username">
</label><br>
    密码 <label>
    <input type="password" name="password">
</label>
    <input type="submit" value="登陆">
</form>
</body>
</html>
