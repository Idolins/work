<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/10/18
  Time: 21:16
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        .odd {
            background-color: red;
        }
    </style>
</head>
<body>
<a href="bookaction.action">获取</a>
<table border="1px">
    <tr>
        <td>书名</td>
        <td>价格</td>
    </tr>

    <s:iterator value="books" var="b" status="st">
        <s:if test="#st.odd">
            <tr class="odd">
                <td><s:property value="#b.name"/></td>
                <td><s:property value="#b.price"/></td>
            </tr>
        </s:if>
        <s:else>
            <tr>
                <td><s:property value="#b.name"/></td>
                <td><s:property value="#b.price"/></td>
            </tr>
        </s:else>
    </s:iterator>


</table>
</body>
</html>
