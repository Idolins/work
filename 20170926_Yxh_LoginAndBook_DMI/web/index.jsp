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

<a href="addBook.jsp" target="show">添加书籍</a>
<a href="updateBook.jsp" target="show">修改书籍</a>
<a href="bookselect!select" target="show">展示书籍</a>
<a href="deleteBook.jsp" target="show">删除书籍</a>

<br>

<iframe src="showBook.jsp" frameborder="0" name="show" width="600px">


</iframe>


</body>
</html>