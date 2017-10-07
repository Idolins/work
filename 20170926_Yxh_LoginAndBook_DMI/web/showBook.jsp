<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/7
  Time: 20:32
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showBook</title>
</head>
<body>
<table border="1">
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>价格</td>
    </tr>
    <s:iterator value="bookList" var="book">
        <tr>
            <td><s:property value="#book.name"/></td>
            <td><s:property value="#book.author"/></td>
            <td><s:property value="#book.price"/></td>
        </tr>
    </s:iterator>


</table>

</body>
</html>
