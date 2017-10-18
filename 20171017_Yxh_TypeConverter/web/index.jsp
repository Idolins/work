<%@ taglib prefix="S" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/17
  Time: 11:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="useraction.action">
    <S:textfield label="姓名" name="username"/> <br>
    <S:textfield label="电话号" name="tel"/> <br>
    <S:textfield label="省份" name="provice"/> <br>
    <S:textfield label="城市" name="city"/> <br>
    <S:textfield label="地区" name="area"/> <br>
    <S:textfield label="街道" name="street"/> <br>
    <s:submit value="提交"/> <br>
</form>
</body>
</html>
