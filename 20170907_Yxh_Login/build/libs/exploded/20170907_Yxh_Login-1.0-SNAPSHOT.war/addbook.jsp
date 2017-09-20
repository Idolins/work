<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/7
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
</head>
<body>
<c:if test="${requestScope.flag eq true}">
    <c:out value="请填写完整信息"/>
</c:if>
<form action="${pageContext.request.contextPath}/add">
    名字<label>
    <input type="text" name="bookName"><br>
</label>
    作者<label>
    <input type="text" name="bookAuthor"><br>
</label>
    价格<label>
    <input type="number" name="bookPrice"><br>
</label>
    <input type="submit" value="提交">
</form>
</body>
</html>
