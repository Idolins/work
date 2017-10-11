<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/11
  Time: 19:06
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
${sessionScope.info}
<s:form action="login" namespace="/">
    <s:textfield label="邮箱" name="user.email"/>
    <s:password label="密码" name="user.password"/>
    <s:submit value="登陆"/>
</s:form>


</body>
</html>
