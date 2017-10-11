<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/11
  Time: 19:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <sx:head/>
</head>
<body>
<s:form action="register" method="POST" namespace="/">
    <s:textfield label="用户名" name="user.username"/>
    <s:password label="密码" name="user.password"/>
    <s:password label="再次输入" name="user.rePassword"/>
    <td><sx:datetimepicker name="user.birthday" displayFormat="yyyy-MM-dd" label="生日"/></td>
    <s:textfield label="email" name="user.email"/>
    <s:textfield label="电话号码" name="user.tel"/>
    <s:submit value="注册"/>
</s:form>
</body>
</html>
