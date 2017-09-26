<%@ page import="com.opensymphony.xwork2.util.ValueStack" %>
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

<s:iterator value="bookList" var="book">
    <s:property value="book"/>
</s:iterator>
</body>
</html>