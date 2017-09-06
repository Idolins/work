<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/4
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>展示书籍</title>
</head>
<body>
查看所有图书
<table border="1">
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>价格</td>
    </tr>
    <c:forEach var="book" items="${requestScope.list}">
        <tr>
            <td><c:out value="${book.bookName}"/></td>
            <td><c:out value="${book.bookAuthor}"/></td>
            <td><c:out value="${book.bookPrice}"/></td>
        </tr>
    </c:forEach>
</table>
<a href="index.jsp">继续添加</a>

</body>
</html>
