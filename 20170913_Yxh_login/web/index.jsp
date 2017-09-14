<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/13
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<form action="login.action" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit" value="登陆">
</form>
</body>
</html>
