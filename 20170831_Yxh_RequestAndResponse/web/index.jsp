<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/8/31
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="req">点击获取</a>
<table>
    <tr>
        <td>localAddr</td>
        <td>${requestScope.req.localAddr}</td>
    </tr>
    <tr>
        <td>method</td>
        <td>${requestScope.req.method}</td>
    </tr>
    <tr>
        <td>remoteAddr</td>
        <td>${requestScope.req.remoteAddr}</td>
    </tr>
</table>
</body>
</html>
