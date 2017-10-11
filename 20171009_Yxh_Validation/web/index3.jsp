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
    <style>
        .imgcode {
            position: fixed;
        }
    </style>
</head>
<body>
${requestScope.login}

<s:form method="POST" action="register3">

    <s:textfield label="E-mail" name="email"/>
    <s:password label="登陆密码" name="password"/>
    <s:password label="确认密码" name="passwordAgain"/>
    <s:textfield label="登录名" name="username"/>
    <s:textfield label="真实姓名" name="reallyName"/>
    <s:textfield type="number" label="手机号" name="telphone"/>
    <s:textfield label="验证码" name="codes"/>
    <td><img class="imgcode" src="verificationCode.action" id="imgCode"></td>
    <s:submit value="登录"/>
</s:form>
</body>
</html>
