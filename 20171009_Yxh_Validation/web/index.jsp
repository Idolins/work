<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/9
  Time: 14:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
${requestScope.login}

<s:form method="POST" action="register">
    <s:textfield label="E-mail" name="email"/>
    <s:password label="登陆密码" name="password"/>
    <s:password label="确认密码" name="passwordAgain"/>
    <s:textfield label="登录名" name="username"/>
    <s:textfield label="真实姓名" name="reallyName"/>
    <s:textfield type="number" label="手机号" name="telphone"/>
    <br>
    <img src="verificationCode.action" id="imgCode">
    <s:textfield label="验证码" name="codes"/>
    <s:submit value="登录"/>
</s:form>
</body>
</html>
