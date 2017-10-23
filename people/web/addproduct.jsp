<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/14
  Time: 18:55
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="product_save" method="POST" theme="simple">
    <table>

        <tr>
            <td>商品名称</td>
            <td><s:textfield name="pname"/></td>
        </tr>

        <tr>
            <td>商品价格</td>
            <td><s:textfield name="price"/></td>
        </tr>
        <tr>
            <td colspan="2"><s:submit value="添加"/></td>
        </tr>
    </table>
</s:form>
</body>
</html>
