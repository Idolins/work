<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/13
  Time: 20:07
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>

</head>
<body>
欢迎<s:property value="user.username"/> <br>

<a href="addBook.jsp">添加书籍</a>
<a href="updateBook.jsp">修改书籍</a>
<a href="bookselect!select">展示书籍</a>
<a href="deleteBook.jsp">删除书籍</a>

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