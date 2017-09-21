<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/21
  Time: 11:37
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算器2</title>
</head>
<body>
<form action="cal1.action">
    num1 <input type="text" name="num1" value="${requestScope.num1}"> <br>
    + <input type="radio" name="op" value="+"  ${requestScope.op=="+"?"checked":""}> <br>
    - <input type="radio" name="op" value="-"  ${requestScope.op=="-"?"checked":""}> <br>
    * <input type="radio" name="op" value="*"  ${requestScope.op=="*"?"checked":""}> <br>
    / <input type="radio" name="op" value="/"  ${requestScope.op=="/"?"checked":""}> <br>
    num2 <input type="text" name="num2" value="${requestScope.num2}"> <br>
    <input type="submit" value="提交">
</form>
计算结果为: ${requestScope.result}
</body>
</html>
