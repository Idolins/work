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
${requestScope.error}
<form action="login.action" method="post">
    用户名：<label>
    <input type="text" name="username">
</label><br>
    密码：<label>
    <input type="password" name="password">
</label> <br>
    验证码： <label>
    <input type="text" name="checkCode">
</label> <br>
    <img src="checkCode.action" onclick="this.src='checkCode.action'"> <br>
    <input type="submit" value="登陆">
</form>
</body>
</html>
